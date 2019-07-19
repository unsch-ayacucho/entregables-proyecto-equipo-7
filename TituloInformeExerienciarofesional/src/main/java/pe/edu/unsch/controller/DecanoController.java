package pe.edu.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.unsch.dao.DecanoDao;
import pe.edu.unsch.entities.Decano;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/decano")
@Controller
public class DecanoController {

    @Autowired
    @Qualifier("decanoRepository")
    private DecanoDao decanoDao;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/decanos", method = RequestMethod.GET)
    public ResponseEntity<List<Decano>> listAllPerson() {
        ArrayList<Decano> persons  = (ArrayList<Decano>) decanoDao.findAll(); 
        if (persons.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Decano>>(persons, HttpStatus.OK);
    }

}
