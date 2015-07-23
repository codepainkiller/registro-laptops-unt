package com.registrount.controllers.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registrount.controllers.database.MysqlConnect;
import com.registrount.controllers.database.TitularController;
import com.registrount.controllers.database.UsuarioController;
import com.registrount.entities.Titular;
import com.registrount.entities.Usuario;


@WebServlet("/RegistraServlet")
public class RegistraUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public RegistraUsuarioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = new Usuario();
		
		usuario.setNombres(request.getParameter("nombres"));
		usuario.setApellidos(request.getParameter("apellidos"));
		usuario.setDireccion(request.getParameter("direccion"));
		usuario.setTelefono(request.getParameter("telefono"));
		usuario.setDni(request.getParameter("dni"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setPassword(request.getParameter("password"));
		usuario.setTipoUsuarioId(Integer.parseInt(request.getParameter("tipo_usuario_id")));
		
		int result = UsuarioController.create(usuario);
		
		if(result > 0) {
			System.out.println("Se ha registrado el usuaio");
			response.sendRedirect("dashboard.jsp");
		} else {
			System.out.println("No se registro el usuario");
			response.sendRedirect("lista-usuarios.jsp");
		}
	}

}
