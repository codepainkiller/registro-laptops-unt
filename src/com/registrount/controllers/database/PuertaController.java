package com.registrount.controllers.database;

import java.sql.SQLException;

import com.registrount.entities.Puerta;

public class PuertaController {
	
	private static MysqlConnect mysql = MysqlConnect.getInstance();
	
	public static int create(Puerta puerta) {
		String 	inserQuery;
		
		inserQuery = "INSERT INTO puerta ("
				+ "name, corriendo) VALUES ("
				+ "'" + puerta.getName()+ "',"
				+ "'" + puerta.getCorriendo() + "')";
		
		try {
			return mysql.insert(inserQuery);
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
