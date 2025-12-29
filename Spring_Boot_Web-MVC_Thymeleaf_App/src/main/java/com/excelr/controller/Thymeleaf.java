package com.excelr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Thymeleaf {

	@GetMapping("/data")
	public String display(Model model) {
		String res = "Welcome To Thymeleaf";
		model.addAttribute("msg" , res);
		return "displaydata";
				
	}
	
}
