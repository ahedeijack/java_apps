package com.curso.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	
	//Ctrl + Barra Espaciadora. Para poder importar las librerias. Así mismo, esto es para poder mandar a llamar el bloque
	
	//Mapeo
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework");
		return "index";
	
	}
	//Metodo handler
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setApellido("Perez");
		usuario.setNombre("Pedro");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario ".concat(usuario.getNombre()));
		
		return "perfil";
		
	}
}
