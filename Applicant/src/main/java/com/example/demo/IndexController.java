package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	
	/*http://localhost:8080/index*/
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	
	
	@PostMapping("/register")
	public String userRegisteration(@ModelAttribute Applicant applicant) {
		System.out.println(applicant.toString());
		
		return "index";
		
	}

}

