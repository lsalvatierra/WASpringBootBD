package edu.pe.idat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CursoNota {
	
	@Id
	private String idcurso;
	
	@Column(name = "nomcurso")
	private String nomcurso;
	@Column(name = "credito")
	private Integer credito;
	@Column(name = "exaparcial")
	private Double exaparcial;
	@Column(name = "exafinal")
	private Double exafinal;
	public String getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(String idcurso) {
		this.idcurso = idcurso;
	}
	public String getNomcurso() {
		return nomcurso;
	}
	public void setNomcurso(String nomcurso) {
		this.nomcurso = nomcurso;
	}
	public Integer getCredito() {
		return credito;
	}
	public void setCredito(Integer credito) {
		this.credito = credito;
	}
	public Double getExaparcial() {
		return exaparcial;
	}
	public void setExaparcial(Double exaparcial) {
		this.exaparcial = exaparcial;
	}
	public Double getExafinal() {
		return exafinal;
	}
	public void setExafinal(Double exafinal) {
		this.exafinal = exafinal;
	}
	
	
	
}
