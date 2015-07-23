package com.registrount.controllers.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.registrount.entities.Usuario;

public class UsuarioController {
	
	public static final String PUBLIC_KEY = "clavesupersecreta";
	private static MysqlConnect mysql = MysqlConnect.getInstance();
	
	public static int create(Usuario usuario) {
		String 	inserQuery;
		String 	passEncrypt; 
		
		passEncrypt = "AES_ENCRYPT('" + usuario.getPassword() + "','" + PUBLIC_KEY + "')";
		
		inserQuery = "INSERT INTO usuario("
				+ "nombres, apellidos, dni, direccion, telefono, email, password, tipo_usuario_id) VALUES("
				+ "'" + usuario.getNombres() + "',"
				+ "'" + usuario.getApellidos() + "',"
				+ "'" + usuario.getDni() + "',"
				+ "'" + usuario.getDireccion() + "',"
				+ "'" + usuario.getTelefono() + "',"
				+ "'" + usuario.getEmail() + "',"
				+  passEncrypt + ","
				+ "'" + usuario.getTipoUsuarioId()+ "')";
		
		try {
			return mysql.insert(inserQuery);
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static Usuario get(int id)  {
		
		try {
			
			String query = "SELECT * from usuario WHERE id = " + id;	
			ResultSet rs = mysql.query(query);
			
			while (rs.next()) {
				
				Usuario user = new Usuario();
				
				user.setId(rs.getInt("id"));
				user.setNombres(rs.getString("nombres"));
				user.setApellidos(rs.getString("apellidos"));
				user.setDireccion(rs.getString("direccion"));
				user.setDni(rs.getString("dni"));
				user.setTelefono(rs.getString("telefono"));
				user.setEmail(rs.getString("email"));
				user.setTipoUsuarioId(rs.getInt("tipo_usuario_id"));
				
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return null;
	}
	
	public static ArrayList<Usuario> getAll() {
		
		ArrayList<Usuario> users = new ArrayList<>();
		
		try {
			//MysqlConnect connect= MysqlConnect.getInstance();
			ResultSet rs = mysql.query("SELECT * FROM usuario");
			
			while (rs.next()) {
				Usuario usuario = new Usuario();
				
				usuario.setId(rs.getInt("id"));
				usuario.setNombres(rs.getString("nombres"));
				usuario.setApellidos(rs.getString("apellidos"));
				usuario.setDireccion(rs.getString("direccion"));
				usuario.setDni(rs.getString("dni"));
				usuario.setTelefono(rs.getString("telefono"));
				usuario.setEmail(rs.getString("email"));
				usuario.setTipoUsuarioId(rs.getInt("tipo_usuario_id"));
				
				users.add(usuario);
			}
			
			return users;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
