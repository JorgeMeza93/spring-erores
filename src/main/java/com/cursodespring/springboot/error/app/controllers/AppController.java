package com.cursodespring.springboot.error.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cursodespring.springboot.error.app.model.domain.Usuario;
import com.cursodespring.springboot.error.app.services.UsuarioService;

@Controller
public class AppController {
	@Autowired
	private UsuarioService usuarioService;
	@GetMapping({"/", "/index"})
	public String index(){
		Integer valor = Integer.parseInt("pipo");
		return "index";
	}
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id, Model model){
		Usuario usuario = usuarioService.obtenerPorId(id);
		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo", "Detalle del usuario ".concat(usuario.getNombre()));
		return "ver";
	}
}
