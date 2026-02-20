package com.test;

import java.util.List;

public class CustDemo {
	public static void main(String[] args) {
		CustDao cdao = new CustDao();
		Customer cst= new Customer();
		
		cst.setC_name("Rithesh");
		cst.setC_city("Kashipatna");
		cst.setC_id(2);
		
		//System.out.println("Inserted successully..");
		//cdao.saveCustomer(cst);
		
		//System.out.println("Updated successully..");
		//cdao.updateCustomer(cst);
		
		//System.out.println("Deleted successfully .. ");
		cdao.deleteCustomer(2);
		
		//List<Customer> list = cdao.getAllCustomer();
		cdao.getAllCustomer().forEach(System.out::println);
	}
}
