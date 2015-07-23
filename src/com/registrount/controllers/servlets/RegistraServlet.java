package com.registrount.controllers.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registrount.controllers.database.MysqlConnect;


@WebServlet("/RegistraServlet")
public class RegistraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PUBLIC_KEY = "clavesupersecreta";
       
 
    public RegistraServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
			
			if (result > 0) {
				response.sendRedirect("lista-usuarios.jsp");
				System.out.println("Usuario guardado exitosamente!");
			} else {
				System.out.println("No se pudo guardar el usuario!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
