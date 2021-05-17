package edu.pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Alumno;
import edu.pe.idat.repository.AlumnoRepository;

@Service
public class AlumnoService {

	@Autowired
	private AlumnoRepository repository;
	
	public List<Alumno> listarAlumnosxEspecialidad(String idEspecialidad){
		return repository.listarAlumnosxEspecialidad(idEspecialidad);
	}
	
}
