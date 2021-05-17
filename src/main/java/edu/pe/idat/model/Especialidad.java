package edu.pe.idat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Especialidad {
	
	@Id
	private String idesp;
	
	@Column(name ="nomesp")
	private String nomespecialidad;

	public String getIdesp() {
		return idesp;
	}

	public void setIdesp(String idesp) {
		this.idesp = idesp;
	}

	public String getNomespecialidad() {
		return nomespecialidad;
	}

	public void setNomespecialidad(String nomespecialidad) {
		this.nomespecialidad = nomespecialidad;
	}
	
	
}
