package pe.edu.unsch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import pe.edu.unsch.entities.Solicitud;
import pe.edu.unsch.service.GenerarSolicitudService;

@Controller
@RequestMapping("views/generarDocumento")
public class GenerarSolicitudController {

	@GetMapping("views/listar")
	public String index() {
		return "views/admin/generarSolicitud/index";
	}

	@GetMapping("views/solicitud")
	public String mantenimiento() {
		return "views/admin/generarSolicitud/mantenimiento";
	}

	@Autowired
	private GenerarSolicitudService generarSolicitudService;

	@GetMapping("solicitud/{id}")
	public ResponseEntity<Solicitud> getArticleById(@PathVariable("id") Integer id) {
		Solicitud solicitud = generarSolicitudService.getSolicitudById(id);
		return new ResponseEntity<Solicitud>(solicitud, HttpStatus.OK);
	}

	@GetMapping("solicitud")
	public ResponseEntity<List<Solicitud>> getSolicitud() {
		List<Solicitud> listaSolicitud = generarSolicitudService.getSolicitud();
		return new ResponseEntity<List<Solicitud>>(listaSolicitud, HttpStatus.OK);
	}
	
	@PostMapping("solicitud")
	public ResponseEntity<Void> addArticle(@RequestBody Solicitud solicitud, UriComponentsBuilder builder) {
                boolean flag = generarSolicitudService.addSolicitud(solicitud);
                if (flag == false) {
        	    return new ResponseEntity<Void>(HttpStatus.CONFLICT);
                }
                HttpHeaders headers = new HttpHeaders();
                headers.setLocation(builder.path("/solicitud/{id}").buildAndExpand(solicitud.getIdSolicitud()).toUri());
                return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("solicitud")
	public ResponseEntity<Solicitud> updateArticle(@RequestBody Solicitud solicitud) {
		generarSolicitudService.updateSolicitud(solicitud);
		return new ResponseEntity<Solicitud>(solicitud, HttpStatus.OK);
	}
	@DeleteMapping("solicitud/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
		generarSolicitudService.deleteSolicitud(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	

}
