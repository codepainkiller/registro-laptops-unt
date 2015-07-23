package com.registrount.controllers.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.registrount.entities.Laptop;
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
	
	public static ArrayList<Laptop> getLaptops(String dni) {
		ArrayList<Laptop> laptops = new ArrayList<>();
		
		String query = "select laptop.* from laptop_titular as LT join laptop join titular " 
				+ "where LT.laptop_id = laptop.id "
				+ "and LT.titular_id = titular.id "
				+ "and titular.dni = " + "'" + dni + "'";
		
		try {
			ResultSet rs = mysql.query(query);
			
			while (rs.next()) {
				Laptop lp = new Laptop();
				lp.setMarca(rs.getString("marca"));
				lp.setModelo(rs.getString("modelo"));
				lp.setSerie(rs.getString("serie"));
				lp.setDescripcion(rs.getString("descripcion"));
				
				laptops.add(lp);
			}
			
			return laptops;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return laptops;
	}
}
