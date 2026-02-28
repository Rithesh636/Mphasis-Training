package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Employee;
import com.test.repository.EmployeeRepository;
import com.test.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/employee/v1/api")
@Tag(name = "Employee CRUD Opertions")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@Autowired
	private EmployeeRepository repo ;
	
	@PostMapping(value = "/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){
		Employee obj = service.saveEmployee(emp);
		
		if(obj != null) {
			return new ResponseEntity<Employee>(obj, HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<Employee>(obj, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/list")
	@Operation(summary = "Listing all employee")
	public ResponseEntity<List<Employee>> listAllEmployee(){
		List<Employee> list = service.getAllEmployee();
		
		if(list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value = "/{id}")
	@Operation(summary = "Getting Employee By Id")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable int id){
		Optional<Employee> em = service.getEmployeeByid(id);
		
		if(em != null) {
			return new ResponseEntity<>(em, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(em, HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee emp)
	{
		emp.setId(id);
		Employee e = service.updateEmployee(emp);
		
		if(e != null) {
			return new ResponseEntity<>(e, HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<List<Employee>> deleteEmployeeById(@PathVariable int id){
		List<Employee> list = service.deleteEmployeeById(id);
		
		if(list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/byname/{name}")
	@Operation(summary = "Get Employee by name")
	public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable String name){
		List<Employee> list = repo.getEmployeeByName(name);
		
		if(list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/bycompany/{company}")
	@Operation(summary = "Get Employee by Company")
	public ResponseEntity<Employee> getEmployeeByCompany(@PathVariable String company){
		List<Employee> list = repo.getEmployeeByCompany(company);
		
		if(list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/byorder")
	public ResponseEntity<List<Employee>> getAllEmployeesByNameASC(){
		List<Employee> list = repo.getEmployeesByNameASC();
		
		if(list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(list, HttpStatus.BAD_REQUEST);
		}
	}

}
