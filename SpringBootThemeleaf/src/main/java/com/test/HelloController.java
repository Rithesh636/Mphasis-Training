package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/")
	public String simpleHomePage(Model model) {
		
		//inbuilt return type for controller is model and view. that is the reason we are redirected to the index.html rather than just printing index string
		
		model.addAttribute("msg", "welcome to thymleaf");
		return "index";
	}
}
