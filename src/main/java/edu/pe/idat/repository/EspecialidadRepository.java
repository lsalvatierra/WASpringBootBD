package edu.pe.idat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, String> {
	
	   @Query(value = "{call sp_ListarEspecialidad()}", 
	    		nativeQuery = true)
	    List<Especialidad> listarEspecialidades();

}
