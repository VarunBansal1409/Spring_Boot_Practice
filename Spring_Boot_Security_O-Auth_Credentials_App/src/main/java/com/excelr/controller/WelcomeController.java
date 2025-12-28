package com.excelr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public ResponseEntity<String> welcome() {
		
		String res = "Welcome to ExcelR Solutions! You have successfully accessed a secured endpoint using OAuth2 authentication.";
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
}
