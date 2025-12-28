package com.excelr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcelrController {

	@GetMapping("/bank")
	public ResponseEntity<String> checkBank(){
		String res = "Welcome to ICICI Bank";
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	
	@GetMapping("/details")
	public ResponseEntity<String> getDetails(){
		String res = "This is Bank Details";
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	
	@GetMapping("/balance")
	public ResponseEntity<String> getBalance(){
		String res = "Balance is 1,00,000 INR";
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	
}
