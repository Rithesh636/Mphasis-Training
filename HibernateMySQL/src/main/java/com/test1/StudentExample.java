package com.test1;

public class StudentExample {
	
	private String name;
	private String college;
	private int id;    // Must declare id in the hibernate project
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "StudentExample [name=" + name + ", college=" + college + ", id=" + id + "]";
	}
	
	
	
	

}
