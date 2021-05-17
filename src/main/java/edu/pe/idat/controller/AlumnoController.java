package edu.pe.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.pe.idat.model.Alumno;
import edu.pe.idat.model.CursoNota;
import edu.pe.idat.service.AlumnoService;
import edu.pe.idat.service.CursoNotaService;
import edu.pe.idat.service.EspecialidadService;

@Controller
@RequestMapping("/Alumno")
public class AlumnoController {

	@Autowired
	private EspecialidadService especialidadService;	
	@Autowired
	private AlumnoService alumnoService;
	@Autowired
	private CursoNotaService cursoNotaService;

	@GetMapping("/frmAlumnosxEspecialidad")
	public String frmListarCurso(Model model) {
		model.addAttribute("listespecialidad", especialidadService.listarEspecialidades());
		model.addAttribute("titulo", "Listado de alumnos");
		return "Alumno/frmAlumnosxEspecialidad";
	}
	
	
	@GetMapping("/listarAlumnosxEspecialidad")
	@ResponseBody
	public List<Alumno> listarCursos(@RequestParam("idesp")String idEspecialidad ){
		return alumnoService.listarAlumnosxEspecialidad(idEspecialidad);
	}
	
	
	@GetMapping("/listarCursosNotasxAlumno")
	@ResponseBody
	public List<CursoNota> listarCursosNota(@RequestParam("idalumno")String idAlumno){
		return cursoNotaService.listarCursoNotaxAlumno(idAlumno);
	}
}
