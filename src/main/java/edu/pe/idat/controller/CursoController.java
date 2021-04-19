package edu.pe.idat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.pe.idat.model.Curso;
import edu.pe.idat.service.CursoService;

@Controller
@RequestMapping("/Curso")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;

	@GetMapping("/frmListarCurso")
	public String frmListarCurso(Model model) {
		model.addAttribute("listcursos", cursoService.listarCursos());
		model.addAttribute("titulo", "Listado de cursos");
		return "Curso/frmListarCurso";
	}
	
	@GetMapping("/frmRegistrarCurso")
	public String frmRegistrarCurso(Model model) {
		model.addAttribute("cursoform", new Curso());
		model.addAttribute("visualizar", false);
		model.addAttribute("titulo", "Registro de curso");
		return "Curso/frmRegistrarCurso";
	}
	
	@PostMapping("/frmRegistrarCurso")
	public String frmRegistrarCurso(
			@ModelAttribute("cursoform") Curso cursoForm,
			Model model) {
		String respuesta = "Curso registrado correctamente.";
		String colormensaje = "alert-success";
		try {
			cursoService.registrarCurso(cursoForm);
		}catch(Exception ex) {
			respuesta = "Curso no registrado.";
			colormensaje = "alert-danger";
		}
    	model.addAttribute("visualizar", true);
    	model.addAttribute("respuesta", respuesta);
    	model.addAttribute("colormensaje", colormensaje);
    	model.addAttribute("titulo", "Registro de curso");
		return "Curso/frmRegistrarCurso";
	}	
	
}
