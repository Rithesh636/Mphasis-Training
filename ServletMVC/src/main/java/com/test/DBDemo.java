package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBDemo {

	public static Connection getDbcon() {
		Connection con = null;
		try {
			
			String url = "jdbc:mysql://localhost:3306/anush";
			
			String user = "root";
			String pas = "root@39";
			
			Class.forName("com.mysql.jdbc.Driver");  // Load the driver
			
			 con = DriverManager.getConnection(url,user,pas);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
		

	}

}
