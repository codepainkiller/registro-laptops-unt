package com.registrount.controllers.database;

import java.sql.SQLException;

import com.registrount.entities.Titular;

public class TitularController {
	private static MysqlConnect mysql = MysqlConnect.getInstance();
	
	public static int create(Titular titular) {
		String 	inserQuery;
		
		inserQuery = "INSERT INTO titular ("
				+ "nombres, apellidos, direccion, telefono, email, dni, codigo, tipo_titular_id) VALUES("
				+ "'" + titular.getNombres() + "',"
				+ "'" + titular.getApellidos() + "',"
				+ "'" + titular.getDireccion() + "',"
				+ "'" + titular.getTelefono() + "',"
				+ "'" + titular.getEmail() + "',"
				+ "'" + titular.getDni() + "',"
				+ "'" + titular.getCodigo() + "',"
				+ "'" + titular.getTipoTituarId() + "')";
		
		try {
			return mysql.insert(inserQuery);
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
