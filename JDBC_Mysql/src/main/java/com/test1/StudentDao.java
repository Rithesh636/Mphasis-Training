package com.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	public static Connection getCon() {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url  = "jdbc:mysql://localhost:3306/mlafeb";
		String usr = "root";
		String pas = "root@39";
		Connection con = null;
		
		try {
			Class.forName(driver);
			 con = DriverManager.getConnection(url,usr,pas);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void saveStudent(Student st) {
	
		String sql = "insert into student(usn, name, college) values(?,?,?)";
		try {
			Connection con = StudentDao.getCon();
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1,st.getUsn());
			pst.setString(2, st.getName());
			pst.setString(3,st.getCollege());
			
			pst.execute();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Student> getStudent() {
		
		String sql = "select * from Student";
		List<Student> list = new ArrayList<>();
		try{
			PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			Student st = new Student();
			while(rs.next()) {
				st.setUsn(rs.getString(1));
				st.setName(rs.getString(2));
				st.setCollege(rs.getString(3));
				
				list.add(st);
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void update(Student s) {
		
		String sql = "update Student set name = ?, college = ? where usn = ?";
		try {
		PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
		
		pst.setString(1,s.getName());
		pst.setString(2,s.getCollege());
		pst.setString(3,s.getUsn());
		
		pst.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Delete(String usn) {
		
		String sql = "delete from student where usn = ?";
		try {
			PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
			
			pst.setString(1,usn);
			pst.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
