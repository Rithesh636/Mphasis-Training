package com.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Dao.CustomerDao;
import com.test.entity.Customer;
import com.test.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao dao;
	
	@Override
	public Customer saveCustomer(Customer c) {
		
		return dao.saveCustomer(c);
	}

	@Override
	public Customer updateCustomer(Customer c) {
		
		return dao.saveCustomer(c);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
	
		return dao.getCustomerById(id);
	}

	@Override
	public List<Customer> deleteCustomerById(int id) {
		
		return dao.deleteCustomerById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return dao.getAllCustomer();
	}

	
	
}
