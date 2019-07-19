package pe.edu.unsch.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import pe.edu.unsch.service.ModuloService;
import pe.edu.unsch.service.SubmoduloService;

@ControllerAdvice
public class CommonController {

    @Autowired
    private ModuloService moduloService;
    @Autowired
    private SubmoduloService submoduloService;


    @ModelAttribute
    public void addAttributes(HttpServletRequest request, Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username=principal instanceof UserDetails ? ((UserDetails) principal).getUsername():principal.toString();

        // Modulos de usuario activo
        model.addAttribute("modulosPorPerfil", moduloService.listarPorPerfil(username));

        // Submodulos de usuario activo
        model.addAttribute("submodulosPorPerfil", submoduloService.listarPorPerfil(username));
    }
}

