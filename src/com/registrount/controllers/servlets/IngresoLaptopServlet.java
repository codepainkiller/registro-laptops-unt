package com.registrount.controllers.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.registrount.controllers.database.LaptopController;
import com.registrount.controllers.database.TitularController;
import com.registrount.entities.Laptop;
import com.registrount.entities.Titular;


@WebServlet("/IngresoLaptopServlet")
public class IngresoLaptopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IngresoLaptopServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DNI: " + request.getParameter("dni"));
		System.out.println("Serie:" + request.getParameter("serie"));
		
		String dni = request.getParameter("dni");
		String serie = request.getParameter("serie");
		
		Titular titular = TitularController.get(dni);
		Laptop laptop = LaptopController.get(serie);
		
		String respuesta = "";
		
		if (titular != null) {
			respuesta += titular.getNombres() + " " + titular.getApellidos();
		}
		else {
			respuesta += "null";
		}
		
		respuesta += ",";
		
		if (laptop != null) {
			respuesta += laptop.getMarca() + " - " + laptop.getModelo();
		}
		else {
			respuesta += "null";
		}
		response.getWriter().print(respuesta);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("DNI: " + request.getParameter("dni"));
		System.out.println("Serie:" + request.getParameter("serie"));
		
		response.getWriter().print("Enviado datos...");
	}

}
