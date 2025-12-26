package com.excelr.DAO;

import org.springframework.stereotype.Component;

@Component("oracle")
public class Oracle implements DataBase{
	
	public void getData() {
		System.out.println("I am from Oracle Class");
	}
	
}
