package com.registrount.controllers.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registrount.entities.Titular;


@WebServlet("/RegistraTitularServlet")
public class RegistraTitularServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistraTitularServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Titular titular = new Titular();
		
		titular.setNombres(request.getParameter("nombres"));
		titular.setApellidos(request.getParameter("apellidos"));
		titular.setDireccion(request.getParameter("direccion"));
		titular.setTelefono(request.getParameter("telefono"));
		titular.setDni(request.getParameter("dni"));
		titular.setEmail(request.getParameter("email"));
		titular.setCodigo(request.getParameter("codigo"));
		titular.setTipoTituarId(Integer.parseInt(request.getParameter("tipo_titular_id")));
		
	}

}
