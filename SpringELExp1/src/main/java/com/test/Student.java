package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("${student.id}")
	private Integer id;
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.fdb}")
	private String fdb;
	
	@Value("${student.gender}")
	private String gender;
	
	@Value("${student.mail}")
	private String mail;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFdb() {
		return fdb;
	}
	public void setFdb(String fdb) {
		this.fdb = fdb;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fdb=" + fdb + ", gender=" + gender + ", mail=" + mail + "]";
	}
	
	
}
