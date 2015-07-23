package com.registrount.controllers.database;

import java.sql.SQLException;

import com.registrount.entities.LaptopTitular;

public class LaptopTitularController {
	
	private static MysqlConnect mysql = MysqlConnect.getInstance();
	
	public static int create(LaptopTitular laptopTitular) {
		String 	inserQuery;
		
		inserQuery = "INSERT INTO laptop_titular ("
				+ "laptop_id, titular_id, fecha, observacion) VALUES ("
				+ "'" + laptopTitular.getLaptopId() + "',"
				+ "'" + laptopTitular.getTitularId() + "',"
				+ "'" + laptopTitular.getFecha() + "',"
				+ "'" + laptopTitular.getObservacion() + "')";
		
		try {
			return mysql.insert(inserQuery);
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
