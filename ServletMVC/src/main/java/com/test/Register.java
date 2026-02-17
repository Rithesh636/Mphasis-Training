package com.test;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import org.apache.catalina.User;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");  //providing a response in the form of web page
	
	PrintWriter out = response.getWriter();
	
	String name = request.getParameter("fname");
	String usr =  request.getParameter("user");
	String pas =  request.getParameter("pwd");
	
	User1 obj = new User1();
	
	obj.setUserName(usr);
	obj.setName(name);
	obj.setPassword(pas);
	
	
	
	String sql = "insert into user101 values('"+obj.getName()+"','"+obj.getUserName()+"','"+obj.getPassword()+"')";
	int dt = 0;
	
	
	try {
		Connection con = DBDemo.getDbcon();
		Statement stmt = con.createStatement();
		dt = stmt.executeUpdate(sql);
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	
	}
	
	
	if(dt > 0) {
		RequestDispatcher rd= request.getRequestDispatcher("Login.html");
		
		rd.forward(request, response);
		out.println("Registered Successfully.");
	}
	else {
		out.println("<center><font color = 'red' > Registration failed.</font></center>");
		RequestDispatcher rd= request.getRequestDispatcher("register.html");
		rd.include(request,response);
	}
	}

}
