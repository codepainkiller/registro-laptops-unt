package com.registrount.controllers.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.registrount.controllers.database.TitularController;
import com.registrount.entities.Laptop;


@WebServlet("/BuscaTitularServlet")
public class BuscaTitularServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public BuscaTitularServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String dni = request.getParameter("dni");
		
		if (!dni.equals("")) {
			
			ArrayList<Laptop> laptops = TitularController.getLaptops(dni);
			
			Gson gson = new Gson();
			String json = gson.toJson(laptops);
			
			response.getWriter().print(json);
			System.out.println(json);
		} 
		else {
			System.out.println("No se recivio DNI");
		}
		
	}

}
