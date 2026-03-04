package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product2")
public class Product2Controller {

	@GetMapping("/service2")
	public String product2Service() {
		return "This is the simple Cloud API Service-2";
	}
}
