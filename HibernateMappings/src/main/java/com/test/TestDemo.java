package com.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestDemo {

	public static void main(String[] args) {	
			
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Order o1 = new Order();
		o1.setO_name("laptop");
		o1.setO_price(40);
		
		Order o2 = new Order();
		o2.setO_name("Mouse");
		o2.setO_price(10);
		
		List<Order> listOrder = Arrays.asList(o1,o2);
		
		User uobj = new User();
		
		uobj.setU_name("Rohit");
		uobj.setOrders(listOrder);
		
		session.persist(uobj);
		t.commit();
		session.close();

	}

}
