package com.test;

import java.util.List;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class TestDemo {

		public static void main(String[] args) {
			
			EmpDao edao = new EmpDao();
			Employee emp1 = new Employee();
			emp1.setId(1);
			emp1.setName("Surya Kumar");
			emp1.setCmp("HP");
			emp1.setCity("Bengalore");
			
			edao.saveEmployee(emp1);
			
			System.out.println("Saved Employee data..");
//			edao.updateEmployee(emp1);
//			System.out.println("updated successfully..");
//			System.out.println("Deleted successfully..");
//			edao.DeleteEmployee(1);
			
			
			
			List<Employee> list = edao.getAllEmployee();	
			for(Employee e : list)
			{
				System.out.println(" "+list.get(0)+" "+list.get(1));
			}
			
		//	list.forEach(System.out::println);
		}
}
