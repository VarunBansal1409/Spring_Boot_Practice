package com.excelr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcelrController {

	@GetMapping("/welcome")
	public ResponseEntity<String> msg(){
		String res = "Welcome to Full Stack Development Course";
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	
}
