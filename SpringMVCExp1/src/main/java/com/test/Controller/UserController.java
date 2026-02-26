package com.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.*;

@Controller
//@RequestMapping("/user/api")
public class UserController {


	@GetMapping("/submitform")
	public String submitUserForm(
		@RequestParam("username") String user, @RequestParam("password") String pas, User uobj, Model model){
			uobj.setUsername(user);
			uobj.setPassword(pas);
			
			model.addAttribute("info", uobj);
			
			if(user.equals("admin") && pas.equals("java")) {
				return "success";
			}
			else {
				return "userform";
			}
		}
	}

