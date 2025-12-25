package com.excelr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDependencyInjectionAppApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringBootDependencyInjectionAppApplication.class, args);
		Son s1 = con.getBean(Son.class);
		s1.m2();
	}

}
