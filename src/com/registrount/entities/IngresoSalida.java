package com.registrount.entities;

import java.util.Date;

public class IngresoSalida {
	
	private Integer id;
	private Date fecha;
	private Integer esIngreso;  // 1 or 0
	private Integer laptopTitularId;
	private Integer puertaId;
	private Integer usuarioId;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public Integer getEsIngreso() {
		return esIngreso;
	}
	
	public void setEsIngreso(Integer esIngreso) {
		this.esIngreso = esIngreso;
	}
	
	public Integer getLaptopTitularId() {
		return laptopTitularId;
	}
	
	public void setLaptopTitularId(Integer laptopTitularId) {
		this.laptopTitularId = laptopTitularId;
	}
	
	public Integer getPuertaId() {
		return puertaId;
	}
	
	public void setPuertaId(Integer puertaId) {
		this.puertaId = puertaId;
	}
	
	public Integer getUsuarioId() {
		return usuarioId;
	}
	
	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
}
