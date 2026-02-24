package com.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
	
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Position A is :("+pointA.getX() + " , "+pointA.getY()+")");
		System.out.println("Position B is :("+pointB.getX() + " , "+pointB.getY()+")");
		System.out.println("Position C is :("+pointC.getX() + " , "+pointC.getY()+")");
	}
	

	@Override
	public void destroy() throws Exception {
		
		System.out.println("DispoableBean destroy method is called for Triangle");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("IniitializingBean init method is called for Triangle");
		
	}
	
	//Custom init method
	public void CustomInit() {
		System.out.println("Custom init method is called for Triangle");
	}
	
	public void cleanUp() {
		System.out.println("Custom destroy or cleanUp method is called for Triangle");
	}


}
