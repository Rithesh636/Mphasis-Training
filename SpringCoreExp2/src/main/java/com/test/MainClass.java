package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		//Customer obj = (Customer)ctx.getBean("cst1",Customer.class);
		//System.out.println (ctx.getBean("adr",Address.class));
		//System.out.println(obj);
		//System.out.println(ctx.getBean("cst1",Customer.class));
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
		Address aobj = ctx.getBean(Address.class);
		
		aobj.setCity("tirupati");
		aobj.setState("AP");
		aobj.setCountry("India");
		
		Address aobj1 = ctx.getBean(Address.class);
		
		aobj1.setCity("BLR");
		aobj1.setState("KA");
		aobj1.setCountry("India");
		
		Customer cst = ctx.getBean(Customer.class);
		
		cst.setId(100);
		cst.setName("Phoo Phoo");
		cst.setAdr(aobj);
		
		System.out.println(cst);
		
	}

}
