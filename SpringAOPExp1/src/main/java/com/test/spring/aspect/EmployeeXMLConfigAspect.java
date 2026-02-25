package com.test.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class EmployeeXMLConfigAspect {
		
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		System.out.println("EmployeeXMLConfigAspect :: Before Invoking getName()");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("EmplyeeXMLConfigAspect :: After invoking getName() methoud return value  "+ value);
		return value;
	}
}
