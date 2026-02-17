package com.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.User;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String usr = request.getParameter("user");
		String pas = request.getParameter("pwd");
		
		User obj = new User();
		
		obj.setName(usr);
		obj.setPassword(pas);
		
		if(usr.equals(obj.getUserName()) && pas.equals(obj.getPassword())
		{
			RequestDispatcher rd = request.getRequestDispatcher("home.html");
			rd.forward(request,response);
		}
		else {
			out.println("<center><font color = 'red' > Registration failed.</font></center>");
			RequestDispatcher rd= request.getRequestDispatcher("Login.html");
			rd.include(request,response);
		}
	}

}
