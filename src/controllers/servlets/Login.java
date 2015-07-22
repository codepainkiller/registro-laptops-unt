package controllers.servlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controllers.database.MysqlConnect;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public static final String PUBLIC_KEY = "clavesupersecreta";
  
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String passEncrypt = "AES_ENCRYPT('" + password + "','" + PUBLIC_KEY + "')";
		
		String query = "SELECT * FROM usuario WHERE "
				+ "email='" + email + "' and "
				+ "password=" + passEncrypt;
	
		try {
			
			MysqlConnect connect = MysqlConnect.getInstance();
			ResultSet rs = connect.query(query);
			
			if (rs.next()) { 
				System.out.println("Logueado!");
				
				HttpSession session = request.getSession();
				
				session.setAttribute("email", email);
				session.setAttribute("nombres", rs.getString("nombres"));
				session.setAttribute("apellidos", rs.getString("apellidos"));
				
				response.sendRedirect("dashboard.jsp");
			} 
			else {
				System.out.println("Credenciales incorrectas!");
				response.sendRedirect("iniciar-sesion.jsp"); 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			response.sendRedirect("iniciar-sesion.jsp");
		}
	}

}
