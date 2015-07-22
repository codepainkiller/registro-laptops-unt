package entities;

import java.util.Date;

public class LaptopTitular {
	
	private Integer id;
	private Date 	fecha;
	private String 	observacion;
	private Integer laptopId;
	private Integer titularId;
	
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
	
	public String getObservacion() {
		return observacion;
	}
	
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	public Integer getLaptopId() {
		return laptopId;
	}
	
	public void setLaptopId(Integer laptopId) {
		this.laptopId = laptopId;
	}
	
	public Integer getTitularId() {
		return titularId;
	}
	
	public void setTitularId(Integer titularId) {
		this.titularId = titularId;
	}
}
