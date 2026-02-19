package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StoreData {
		public static void main(String[] args) {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory sf = cfg.buildSessionFactory();    
			Session session = sf.openSession();
			Transaction t = session.beginTransaction();
			
			Book obj = new Book();
			
			//insert
			obj.setB_name("HTML");
			obj.setB_author("dell");
			obj.setB_price(7);
//			session.persist(obj);   // inserting
//			t.commit();						// Storing in the database
			
			Book data = session.get(Book.class, 2);  // id=1
			System.out.println(data);
			
			//update
//			data.setB_name("HTML");
//			data.setB_author("James");
//			data.setB_price(5);
//			session.persist(data);  //pushing data 
//			t.commit();
			
			
			//delete
			session.remove(data);
			t.commit();
			
//			List<Book> books = session.createNativeQuery("select * from book", Book.class).list();
//			books.forEach(System.out::println);
//			
			System.out.println("Done...");
			
		}
}
