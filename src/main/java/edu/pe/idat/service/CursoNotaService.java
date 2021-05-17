package edu.pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.CursoNota;

import edu.pe.idat.repository.CursoNotaRepository;

@Service
public class CursoNotaService {
	@Autowired
	private CursoNotaRepository repository;
	
	public List<CursoNota> listarCursoNotaxAlumno(String idAlumno){
		return repository.listarCursoNotaxAlumno(idAlumno);
	}
}
