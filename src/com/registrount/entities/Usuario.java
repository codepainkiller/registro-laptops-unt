package com.registrount.entities;

public class Usuario {
	
	private Integer id;
	private String dni;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	private String email;
	private String password;
	private Integer tipoUsuarioId;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getTipoUsuarioId() {
		return tipoUsuarioId;
	}
	
	public void setTipoUsuarioId(Integer tipoUsuarioId) {
		this.tipoUsuarioId = tipoUsuarioId;
	}
}
