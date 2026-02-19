package com.test1;

import java.util.List;

public class StudentMain {

	
	public static void main(String[] args) {
		
		Student s = new Student();
		StudentDao sdao = new StudentDao();
		s.setUsn("MT044");
		s.setName("Nitheesh");
		s.setCollege("MIT");
		
//		sdao.saveStudent(s);
//		System.out.println("Inserted successfully..");
		
//		sdao.update(s);
//		System.out.println("updated successfully");
		
//		sdao.Delete("MT044");
//		System.out.println("Deleted successfully");
		
		List<Student>list = sdao.getStudent();
		for(Student s1 : list) {
			System.out.println(" "+list.get(0)+" "+list.get(1));
		}
	}
}
