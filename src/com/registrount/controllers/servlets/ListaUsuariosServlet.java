package com.registrount.controllers.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.registrount.controllers.database.UsuarioController;
import com.registrount.entities.Usuario;


@WebServlet("/ListaUsuariosServlet")
public class ListaUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ListaUsuariosServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Usuario> users = UsuarioController.getAll();		
		Gson gson = new Gson();
		
		String jsonObjet = gson.toJson(users);
		response.getWriter().println(jsonObjet); 
		
		System.out.println(jsonObjet);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
