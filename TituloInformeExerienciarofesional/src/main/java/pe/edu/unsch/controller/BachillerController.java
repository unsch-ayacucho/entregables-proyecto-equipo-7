package pe.edu.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.unsch.Util.CustomErrorType;
import pe.edu.unsch.dao.BachillerDao;
import pe.edu.unsch.entities.Bachiller;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/bachillerController")
@Controller
public class BachillerController {

    @Autowired
    @Qualifier("bachillerRepository")
    private BachillerDao bachillerDao;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/bachiller/{codigo}", method = RequestMethod.GET)
    public ResponseEntity<?> getBachiller(@PathVariable("codigo") String codigo) {
        try {
            Bachiller bachiller = bachillerDao.findById(codigo).get();
            if (bachiller == null) {

                return new ResponseEntity(new CustomErrorType("Persona con  id " + codigo + " not found"), HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<Bachiller>(bachiller, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.OK);
        }
    }

}
