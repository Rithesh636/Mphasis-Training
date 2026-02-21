package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDem {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Address ad = new Address();
		ad.setCity("Bengalore");
		ad.setState("Karnataka");
		
		
		Employee emp = new Employee();
		emp.setE_cmp("HP");
		emp.setE_name("Rohit");
		emp.setAddress(ad);
		
		ad.setEmployee(emp);
		session.persist(emp);
		t.commit();
		session.close();
		
	}
}
