package com.test.service;

import java.util.List;
import java.util.Optional;

import com.test.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer c);
	public Customer updateCustomer(Customer c);
	public Optional<Customer> getCustomerById(int id);
	public List<Customer> deleteCustomerById(int id);
	public List<Customer> getAllCustomer();
}
