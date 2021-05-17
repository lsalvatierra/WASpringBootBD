package edu.pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Especialidad;
import edu.pe.idat.repository.EspecialidadRepository;

@Service
public class EspecialidadService  {

	@Autowired
	private EspecialidadRepository repository;

	public List<Especialidad> listarEspecialidades(){
		return repository.listarEspecialidades();
	}
}
