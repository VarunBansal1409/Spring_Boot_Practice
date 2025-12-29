package com.excelr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class WelcomeController {

	// using normal method
	
	@GetMapping("/welcome")
	public ResponseEntity<String> Welcome(){
		String res = "Welcome to Java Full Stack";
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	
	// using pathparams
	@GetMapping("/user/{name}")
	public ResponseEntity<String> getPathMag(@PathVariable("name") String name)
	{
		String res1 = "Welcome to Excelr " + name;
		return new ResponseEntity<String>(res1, HttpStatus.OK);
	}
	
	// using queryparams
	
	@GetMapping("/users")	// http://localhost:8080/users?name=value
	public ResponseEntity<String> getQueryMag(@RequestParam(value="name", defaultValue = "true") String name)
	{
		String res2 = "Welcome to Java " + name;
		return new ResponseEntity<String>(res2, HttpStatus.OK);
	}


}
