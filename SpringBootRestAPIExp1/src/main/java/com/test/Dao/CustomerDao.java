package com.test.Dao;

import java.util.List;
import java.util.Optional;

import com.test.entity.Customer;

public interface CustomerDao {

	public Customer saveCustomer(Customer c);
	public Customer updateCustomer(Customer c);
	public Optional<Customer> getCustomerById(int id);
	public List<Customer> deleteCustomerById(int id);
	public List<Customer> getAllCustomer();
	
}
