package com.test;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.coyote.RequestGroupInfo;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		System.out.println("from login servlet...");
		
		//String usr = request.getParameter("usr");
		//String pas = request.getParameter("pwd");
		//String dt = usr+" "+pas;
		
		//ServletContext ctx = getServletContext();
		
		//ctx.setAttribute("info", dt); // key value pair
		
		ServletContext ctx = getServletContext();
		
		String ct = ctx.getInitParameter("city");
		String st = ctx.getInitParameter("state");
		
		String dt = ct+" "+st;
		
		ctx.setAttribute("info",dt);
		
		ServletConfig cfg = getServletConfig();
		
		String usr = cfg.getInitParameter("user");
		String pwd = cfg.getInitParameter("pas");
		
		out.println("config data from login servlet :"+ usr+ " ");
		
		out.println("from login servlet: "+dt);
		
		out.println("<br><a href ='Logout'> log out here</a>");
	}

}
