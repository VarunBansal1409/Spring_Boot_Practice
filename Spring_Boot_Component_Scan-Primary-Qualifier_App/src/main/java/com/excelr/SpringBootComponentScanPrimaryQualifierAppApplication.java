package com.excelr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.excelr.service.ExcelRService;

@SpringBootApplication
public class SpringBootComponentScanPrimaryQualifierAppApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringBootComponentScanPrimaryQualifierAppApplication.class, args);
		ExcelRService es = con.getBean(ExcelRService.class);
		es.m1();
	}

}
