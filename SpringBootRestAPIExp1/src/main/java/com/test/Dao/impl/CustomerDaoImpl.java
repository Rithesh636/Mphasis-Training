package com.test.Dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.Dao.CustomerDao;
import com.test.entity.Customer;
import com.test.repository.CustomerRepository;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	private CustomerRepository repo;
	
	@Override
	public Customer saveCustomer(Customer c) {
		
		return repo.save(c);
	}

	@Override
	public Customer updateCustomer(Customer c) {
		
		return repo.save(c);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Customer> deleteCustomerById(int id) 
	{
		repo.deleteById(id);
		return repo.findAll();
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return repo.findAll();
	}

	
}
