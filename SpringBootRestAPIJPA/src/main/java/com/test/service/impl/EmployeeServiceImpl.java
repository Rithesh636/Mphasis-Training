package com.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.EmployeeDao;
import com.test.entity.Employee;
import com.test.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee saveEmployee(Employee emp) {
		
		return dao.saveEmployee(emp);
	}

	@Override
	public Optional<Employee> getEmployeeByid(int id) {
		
		return dao.getEmployeeByid(id);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		return dao.updateEmployee(emp);
	}

	@Override
	public List<Employee> deleteEmployeeById(int id) {
		
		return dao.deleteEmployeeById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return dao.getAllEmployee();
	}

	
}
