package com.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   //to display web pages we use @controller otherwise we use @Restcontroller for returning json format data
@EnableMethodSecurity
public class UserController {

	@GetMapping("/")
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/user/read")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
	public String userPage() {
		return "simple user url link";
	}
	
	@GetMapping("delete")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String adminPage() {
		return "ONLY ADMIN CAN DELETE THE DATA";
	}
	
	@GetMapping("update")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String updateUsers() {
		return "Details updated with admin role";
	}
	
	@GetMapping("/user/hr/onboard")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_HR','ROLE_EMPLOYEE')")
	public String updateHR() {
		return "Onboarding employee with HR role";
	}
	

}
