package com.registrount.controllers.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.registrount.controllers.database.IngresoSalidaController;
import com.registrount.entities.IngresoSalida;

/**
 * Servlet implementation class ListaIngresosServelet
 */
@WebServlet("/ListaIngresosServelet")
public class ListaIngresosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaIngresosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Map<String,Object>> ListIngresos = IngresoSalidaController.getAll_Ingresos();
		Gson gson = new Gson();		
		String jsonObjet = gson.toJson(ListIngresos);
		response.getWriter().println(jsonObjet); 
		
		System.out.println(jsonObjet);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
