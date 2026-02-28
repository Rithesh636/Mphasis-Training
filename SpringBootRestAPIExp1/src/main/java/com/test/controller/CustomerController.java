package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Customer;
import com.test.service.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/controller")
@Tag(name = "Crude operations")
public class CustomerController {

	@Autowired
	private CustomerService cs; 
	
	@PostMapping("/create")
	@Operation(summary = "Save the Customer details in the database")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer c){
		Customer cust = cs.saveCustomer(c);
		if(cust != null) {
			return new ResponseEntity<>(cust, HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>(cust, HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/update/{id}")
	@Operation(summary = "Update the Customer details")
	public ResponseEntity<Customer> updateCustomer(@PathVariable int id,  @RequestBody Customer c){
		c.setId(id);
		Customer up = cs.updateCustomer(c);
		if(up != null) {
			return new ResponseEntity<>(up, HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<>(up, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/getbyid/{id}")
	@Operation(summary = "Get Customer By Id ")
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable int id)
	{
		Optional<Customer> cust = cs.getCustomerById(id);
		if(cust != null) {
			return new ResponseEntity<>(cust, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(cust, HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	@Operation(summary = "Delete Customer Details By Id")
	public ResponseEntity<List<Customer>> deleteCustomerById(@PathVariable int id)
	{
		List<Customer> list = cs.deleteCustomerById(id);
		
		if(list != null) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("/getAll")
	@Operation(summary = "Retrieve all customer details")
	public ResponseEntity<List<Customer>> getAll()
	{
		List<Customer> list = cs.getAllCustomer();
		
		if(list != null) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
		
	}
	
}










