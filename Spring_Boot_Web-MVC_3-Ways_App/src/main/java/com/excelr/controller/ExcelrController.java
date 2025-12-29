package com.excelr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExcelrController {

//	By Using Normal Method
	
	@GetMapping("/welcome")
	@ResponseBody
	public String WelcomeMsg()
	{
		return "Welcome to Spring Web MVC";
	}
	
	
//	By Using Model
	
	@GetMapping("/excelr")
	public String greet(Model model) {
			model.addAttribute("msg", "Welcome to Excelr"); // addAttribute() is a instance method accept data in the form of key and value pair
			return "firstApp";	// in src folder --> main folder --> in webapp folder create pages folder and create firstApp.jsp	(whatever written in return)
	}
	
	
//	By Using ModelAndView
	
	@GetMapping("/byebye")
	public ModelAndView bye() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("res", "Thank You Java Full Stack Dev");
		mav.setViewName("secondApp");
		return mav;
	}
	
	
}
