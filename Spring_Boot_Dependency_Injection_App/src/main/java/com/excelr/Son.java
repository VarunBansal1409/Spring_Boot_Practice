package com.excelr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Son {
	
/*	//Setter Dependency Injection
	
	private Father f1;

	@Autowired
	public void setF1(Father f1) {
		this.f1 = f1;
	}
	
	public void m2() {
		System.out.println("I am from Son Class");
		f1.m1();
	}
*/
	
	
	/*	// Constructor Dependency Injection
	
	private Father f1;
	
	@Autowired // Optional
	public Son(Father f1) {
		super();
		this.f1 = f1;
	}
	
	public void m2() {
		System.out.println("I am from Son Class");
		f1.m1();
	}
*/
	

	// Field Dependency Injection
	
	@Autowired
	private Father f1;

	public void m2() {
		System.out.println("I am from Son Class");
		f1.m1();
	}
}
