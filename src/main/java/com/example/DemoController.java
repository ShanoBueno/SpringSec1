package com.example;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@ResponseBody
	@RequestMapping("/")
	public String demo() {
		return "hi simplilearn users, this is another commit"; 
	}
	
	@ResponseBody
	@RequestMapping("/user")
	public String demouser() {
		return "hi simplilearn role user, this is another mesage"; 
	}
	
	@ResponseBody
	@RequestMapping("/admin")
	public String demoadmin() {
		return "hi simplilearn role admin"; 
	}
	
	
	
}
