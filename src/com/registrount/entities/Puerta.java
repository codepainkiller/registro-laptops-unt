package com.registrount.entities;

public class Puerta {
	
	private Integer id;
	private String name;
	private Integer corriendo; // 1 or 0
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getCorriendo() {
		return corriendo;
	}
	
	public void setCorriendo(Integer corriendo) {
		this.corriendo = corriendo;
	}
}
