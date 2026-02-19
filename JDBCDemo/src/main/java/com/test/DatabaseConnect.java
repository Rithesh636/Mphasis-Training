package com.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnect {
	
	public static void main(String args[]) {
	
		try {

		Connection con = DBDemo.getCon();
		Statement stmt = con.createStatement();
		
		// Table Creation
//		String sql = "create table rithesh(id int, name varchar(50))";
//		stmt.execute(sql);
//		System.out.println("table created successfully..");
		
//		String sqlI = "insert into rithesh values(003,'Prajwal')";
//		stmt.execute(sqlI);
//		System.out.println("Values inserted successfully..");
//		
//		String sqlR = "select * from rithesh";
	//ResultSet rs = stmt.executeQuery(sqlR);
//		while(rs.next()) {
//			System.out.println("ID :"+rs.getInt(1)+" Name :"+rs.getString(2));
//		}
//		
//		while(rs.next()) {
//			System.out.println("ID :"+rs.getInt(1)+" Name :"+rs.getString(2));
//		}
//		//System.out.println(rs);
//		System.out.println("Select statement executed successfully");
		
//		String sqlU = "update rithesh set name ='Swastik' where id = 002";
//		stmt.execute(sqlU);
//		System.out.println("table updated succeessfully");
		
		String sqlD = "delete from rithesh where id=01";
		stmt.execute(sqlD);
		System.out.println("record deleted successfully");
		
		
		con.close();
		
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
}
}

