package com.test.dao;

import java.util.List;
import java.util.Optional;

import com.test.entity.Employee;

public interface EmployeeDao {

	public Employee saveEmployee(Employee emp);
	public Optional<Employee> getEmployeeByid(int id);
	public Employee updateEmployee(Employee emp);
	public List<Employee> deleteEmployeeById(int id);
	public List<Employee> getAllEmployee();
}
