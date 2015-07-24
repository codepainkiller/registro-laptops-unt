package com.registrount.controllers.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.registrount.entities.Laptop;
import com.registrount.entities.Usuario;

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
	
	public static Laptop get(String serie)  {
		
		try {
			
			String query = "SELECT * from laptop WHERE serie = '" + serie + "'";	
			ResultSet rs = mysql.query(query);
			
			while (rs.next()) {
				
				Laptop laptop = new Laptop();
				
				laptop.setId(rs.getInt("id"));
				laptop.setMarca(rs.getString("marca"));
				laptop.setModelo(rs.getString("modelo"));
				laptop.setSerie(rs.getString("serie"));
				laptop.setDescripcion(rs.getString("descripcion"));
				
				return laptop;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return null;
	}
	
}
