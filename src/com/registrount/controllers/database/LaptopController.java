package com.registrount.controllers.database;

import java.sql.SQLException;

import com.registrount.entities.Laptop;

public class LaptopController {
	
	private static MysqlConnect mysql = MysqlConnect.getInstance();
	
	public static int create(Laptop laptop) {
		String 	inserQuery;
		
		inserQuery = "INSERT INTO laptop ("
				+ "marca, modelo, serie, descripcion) VALUES ("
				+ "'" + laptop.getMarca() + "',"
				+ "'" + laptop.getModelo() + "',"
				+ "'" + laptop.getSerie() + "',"
				+ "'" + laptop.getDescripcion() + "')";
		
		try {
			return mysql.insert(inserQuery);
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

}
