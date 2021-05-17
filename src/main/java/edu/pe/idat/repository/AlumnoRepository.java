package edu.pe.idat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.Alumno;


@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String> {

	   @Query(value = "{call sp_ListarAlumnosxEspecialidad(:idespecialidad)}", 
	    		nativeQuery = true)
	    List<Alumno> listarAlumnosxEspecialidad(
	    		@Param("idespecialidad")String idEspecialidad);
}
