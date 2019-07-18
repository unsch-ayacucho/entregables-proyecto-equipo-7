package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping({"/", "/login"})
	public String login(Model model) {
	model.addAttribute("titulo", "Login | Punto Venta");
	return "views/admin/login/index";
	}	
	
	
	/*@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private ModuloService moduloService;
	
	@Autowired
	private SubmoduloService submoduloService;

	@GetMapping("views/login")
	public String index(Model model) {
		// model.addAttribute("error", "");
		return "views/admin/login/index";
	}

	@PostMapping("/login")
	public String login(HttpServletRequest request, HttpSession session, Model model) {
		model.addAttribute("user", new Usuario());
		Usuario user = this.usuarioService.login(request.getParameter("username"), request.getParameter("password"));
		if (user == null) {
			model.addAttribute("error", "Cuenta inválida");
			return index(model);
			// return "redirect:/views/login";
		} else {
			session.setAttribute("usuario", user.getUsuario());
			// Modulos del usuario en sesion
			session.setAttribute("modulosPorPerfil", moduloService.listarPorPerfil(user.getUsuario()));

			// Submodulos de usuario en sesion
			session.setAttribute("submodulosPorPerfil", submoduloService.listarPorPerfil(user.getUsuario()));

			return "redirect:/views/home";
		}
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("usuario");
		session.removeAttribute("modulosPorPerfil");
		session.removeAttribute("submodulosPorPerfil");
		return "redirect:/views/login";
	}*/
}
