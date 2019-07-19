package pe.edu.unsch.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.unsch.service.UploadFileService;

import java.io.IOException;
import java.util.List;

@RequestMapping("/upload")
@CrossOrigin(origins = "*")
@RestController
@Controller
public class UploadFileController {

    @Autowired
    private UploadFileService uploadFileService;



    @PostMapping("upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return new ResponseEntity<Object>("Seleccionar un archivo", HttpStatus.OK);
        }

        try {
            uploadFileService.saveFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<Object>("Archivo subido correctamente", HttpStatus.OK);
    }

    @PostMapping("/uploadMultiple")
    public ResponseEntity uploadMultipleFiles(@RequestParam("files") List<MultipartFile> files){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username=principal instanceof UserDetails ? ((UserDetails) principal).getUsername():principal.toString();
        if(files.size() == 0){
            return new ResponseEntity("Seleccionar algun archivo",HttpStatus.OK);
        }
        try {
            uploadFileService.saveMultipleFiles(files,username);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity("Archivos subidos correctamente",HttpStatus.OK);
    }

}

