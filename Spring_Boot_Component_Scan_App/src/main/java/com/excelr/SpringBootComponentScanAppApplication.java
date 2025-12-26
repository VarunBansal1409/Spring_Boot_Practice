package com.excelr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.excelr, com.excelr.branch, com.demo")
public class SpringBootComponentScanAppApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringBootComponentScanAppApplication.class, args);
		A a1 = con.getBean(A.class);
		
	}

}
