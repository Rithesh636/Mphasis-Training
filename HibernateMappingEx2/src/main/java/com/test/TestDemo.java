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
	
	o1.setO_name("Orange");
	o1.setO_price("50");
	
	Order o2 = new Order();
	o2.setO_name("apple");
	o2.setO_price("40");
	
	Order o3 = new Order();
	
	o3.setO_name("Mango");
	o3.setO_price("40");
	
	Order o4 = new Order();
	o4.setO_name("Pineapple");
	o4.setO_price("30");
	
	List<Order> list = Arrays.asList(o1,o2);
	
	List<Order> list1 = Arrays.asList(o3,o4);
	
	Customer cst = new Customer();
	
	cst.setName("Kohli");
	cst.setOrders(list);
	
	Customer cst2 = new Customer();
	
	cst2.setName("Rithesh");
	cst2.setOrders(list1);
	
	session.persist(cst);
	session.persist(cst2);
	t.commit();
	session.close();
	}
	
	
}
