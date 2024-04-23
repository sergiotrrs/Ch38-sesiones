package org.generation.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {
	
	@GetMapping("/greeting") // localhost:8080/gretting
	public String greeting(
			@RequestParam(name="name", required=false, defaultValue="World") String name, 
			Model model) {
		
		model.addAttribute("name", name);
		
		if ( name.equals("Ezquivel")) {
			return "dropout";
		}else {
			return "greeting";			
		}
		
		
	}

}
