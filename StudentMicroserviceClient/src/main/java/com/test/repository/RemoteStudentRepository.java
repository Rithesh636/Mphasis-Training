package com.test.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.test.entity.Student;

public class RemoteStudentRepository {
	
	public static String STUDENT_URL = "http://SPRINGBOOTSTUDENTMICROSERVICE";
	
	@Autowired
	protected RestTemplate restTemplate;
	
	public List<Student> getAllStudents()
	{
		List<Student> data = restTemplate.getForObject(STUDENT_URL+"/students", new ArrayList<Student>().getClass());
		
		
		return data;
	}
	
	public Student getStudentById(int id)
	{
		Student obj = restTemplate.getForObject(STUDENT_URL+"/student/{id}", Student.class, id);
		
		return obj;
	}
	
	public Student createStudent(Student obj)
	{
		obj = restTemplate.postForObject(STUDENT_URL+"/create", obj, Student.class);
		
		return obj;
	}
	
	public Student updateStudent(Student obj, int id)
	{
		obj.setId(id);
		
		restTemplate.put(STUDENT_URL+"/update/{id}",obj,Student.class,id);
		
		//restTemplate.put(STUDENT_URL, obj, null);
		
		return obj;
	}
	
	public List<Student> deleteStudentById(int id)
	{
		restTemplate.delete(STUDENT_URL+"/delete/{id}", Student.class, id);
		
		
		List<Student> data = restTemplate.getForObject(STUDENT_URL+"/students", new ArrayList<Student>().getClass());
		
		
		return data;
	}
	
}
