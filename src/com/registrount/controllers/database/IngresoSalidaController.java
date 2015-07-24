package com.registrount.controllers.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	
	public static ArrayList<Map<String, Object>> getAll_Ingresos() 
	{
		ArrayList<Map<String, Object>> ListIngresos = new ArrayList();	
		
		
		try {
			ResultSet rs = mysql.query("SELECT ltis.id, l.marca, l.modelo, l.serie, t.dni, t.apellidos, t.nombres, t.codigo, ltis.fecha"
					+ " FROM ingreso_salida ltis inner join laptop_titular lt on lt.id = ltis.laptop_titular_id "
											+"inner join titular t on t.id = lt.titular_id "
											+"inner join laptop l on l.id = lt.laptop_id "
											+"inner join usuario u on ltis.usuario_id = u.id "
											+"inner join puerta p on ltis.puerta_id = p.id where ltis.es_ingreso = true");
			
			
			while (rs.next()) {				
				
				Map<String, Object> map = new HashMap();
				
				map.put("id",rs.getInt(1));
				map.put("marca", rs.getString(2));
				map.put("modelo", rs.getString(3));
				map.put("serie", rs.getString(4));
				map.put("dni", rs.getString(5));
				map.put("apellidos", rs.getString(6));
				map.put("nombres", rs.getString(7));
				map.put("codigo", rs.getString(8));
				map.put("fecha", rs.getTimestamp(9));
				
				ListIngresos.add(map);
				
			}
			
			return ListIngresos;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
}
