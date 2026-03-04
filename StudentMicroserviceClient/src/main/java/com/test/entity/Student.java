package com.test.entity;

import java.io.Serializable;

public class Student
{


	private int id;
	
	private String anme;
	
	private String college;
	
	public Student()
	{
		
	}
	
	public Student(int id, String name, String college)
	{
		this.id = id;
		this.anme = name;
		this.college = college;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnme() {
		return anme;
	}

	public void setAnme(String anme) {
		this.anme = anme;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", anme=" + anme + ", college=" + college + "]";
	}
		
}
