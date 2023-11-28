package org.java.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String page1(Model model) {
		
		final String username = "Darth Vader";
		
		model.addAttribute("username", username);
		
		return "page1";
	}

}
