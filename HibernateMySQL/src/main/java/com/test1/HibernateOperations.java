package com.test1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateOperations {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();    
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		StudentExample st = new StudentExample();
		
		//insert
//		st.setName("Nitheesh");
//		st.setCollege("MITE");
//		session.persist(st);
//		t.commit();
		
		//Read
//		StudentExample st1 = session.get(StudentExample.class, 1);
//		System.out.println(st1);
		
		//update 
//		st1.setName("Nitheesh");
//		st1.setCollege("KSIT");
//		session.persist(st1);
//		t.commit();
		
		//delete
//		session.remove(st1);
//		t.commit();
		
		List<StudentExample> st1 = session.createNativeQuery("select * from Studenttable", StudentExample.class).list();
		for(StudentExample s : st1) {
			System.out.println(s);
		}
		
	}
}
