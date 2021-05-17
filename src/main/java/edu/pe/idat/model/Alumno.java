package edu.pe.idat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alumno {
	@Id
	private String idalumno;
	@Column(name = "apealumno")
	private String apealumno;
	@Column(name = "nomalumno")
	private String nomalumno;
	@Column(name = "proce")
	private String proce;

	public String getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(String idalumno) {
		this.idalumno = idalumno;
	}
	public String getApealumno() {
		return apealumno;
	}
	public void setApealumno(String apealumno) {
		this.apealumno = apealumno;
	}
	public String getNomalumno() {
		return nomalumno;
	}
	public void setNomalumno(String nomalumno) {
		this.nomalumno = nomalumno;
	}
	public String getProce() {
		return proce;
	}
	public void setProce(String proce) {
		this.proce = proce;
	}

	
	
}
