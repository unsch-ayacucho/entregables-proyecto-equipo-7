package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
