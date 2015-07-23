package com.registrount.controllers.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
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
		/*
		for (Usuario usuario : users) {
			System.out.println(usuario.getNombres());
			System.out.println(usuario.getApellidos());
			System.out.println("---------------");
		}*/
		
		Gson gson = new Gson();
		String jsonObjet = gson.toJson(users);
		
		//jsonObjet = "{ \"data\":" + jsonObjet + "}"; 

		System.out.println(jsonObjet);
		response.getWriter().println(jsonObjet); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
