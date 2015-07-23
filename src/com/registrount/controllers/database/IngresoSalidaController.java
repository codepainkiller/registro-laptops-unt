package com.registrount.controllers.database;

import java.sql.SQLException;

import com.registrount.entities.IngresoSalida;

public class IngresoSalidaController {
	
	private static MysqlConnect mysql = MysqlConnect.getInstance();
	
	public static int create(IngresoSalida ingresoSalida) {
		String 	inserQuery;
		
		inserQuery = "INSERT INTO ingreso_salida ("
				+ "fecha, es_ingreso, laptop_titular_id, puerta_id, usuario_id) VALUES ("
				+ "'" + ingresoSalida.getFecha() + "',"
				+ "'" + ingresoSalida.getEsIngreso() + "',"
				+ "'" + ingresoSalida.getLaptopTitularId() + "',"
				+ "'" + ingresoSalida.getPuertaId() + "',"
				+ "'" + ingresoSalida.getUsuarioId() + "')";
		
		try {
			return mysql.insert(inserQuery);
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
