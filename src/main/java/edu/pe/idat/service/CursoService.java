package edu.pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Curso;
import edu.pe.idat.repository.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;

	public List<Curso> listarCursos(){
		return cursoRepository.findAll();
	}
	
	public void registrarCurso(Curso curso) {
		if(curso.getIdcurso() == null) {
			cursoRepository.registrarCurso(curso.getNomcurso(), 
					curso.getCredito());
		}else {
			cursoRepository.actualizarCurso(curso.getIdcurso(),
					curso.getNomcurso(), 
					curso.getCredito());
		}		
	}
	

	public void eliminarCurso(Curso curso) {
		cursoRepository.eliminarCurso(curso.getIdcurso());
	}
}
