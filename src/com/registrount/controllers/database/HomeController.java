package com.registrount.controllers.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registrount.entities.Usuario;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String PUBLIC_KEY = "clavesupersecreta";
	
	private Connection connection = null;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served atawdw: ").append(request.getContextPath());
		System.out.println("Llego do get!");
		
		//RequestDispatcher requestDispatcher; 
		//requestDispatcher = request.getRequestDispatcher("/index.jsp");
		//requestDispatcher.forward(request, response);
		
		/*
		ArrayList<Usuario> usuarios = new ArrayList<>();
		
		try {
			MysqlConnect connect = MysqlConnect.getInstance();
			ResultSet rs = connect.query("SELECT * FROM usuario");
			
			while(rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNombres(rs.getString("nombres"));
				usuario.setApellidos(rs.getString("apellidos"));
				usuario.setDireccion(rs.getString("direccion"));
				usuario.setDni(rs.getString("dni"));
				usuario.setTelefono(rs.getString("telefono"));
				usuario.setEmail(rs.getString("email"));
				usuario.setTipoUsuarioId(rs.getInt("tipo_usuario_id"));;
				
				usuarios.add(usuario);
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("nombres"));
				System.out.println(rs.getString("apellidos"));
				System.out.println("----------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//doGet(request, response);
		
		String password = "AES_ENCRYPT('" + request.getParameter("password") + "','" + PUBLIC_KEY + "')";
		
		MysqlConnect connect = MysqlConnect.getInstance();
		String query = "INSERT INTO usuario(nombres, apellidos, dni, direccion, telefono, email, password, tipo_usuario_id) VALUES ("
				+ "'" + request.getParameter("nombres") + "',"
				+ "'" + request.getParameter("apellidos") + "',"
				+ "'" + request.getParameter("dni") + "',"
				+ "'" + request.getParameter("direccion") + "',"
				+ "'" + request.getParameter("telefono") + "',"
				+ "'" + request.getParameter("email") + "',"
			    + password + ","
				+ "'" + request.getParameter("tipo_usuario_id") + "')";	

		try {
			int result = connect.insert(query);
			System.out.println("Usuaurio guardado exitosamente!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Llego do post!");
		//response.sendRedirect("dashboard.jsp");
	}

}
