package com.excelr.DAO;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mysql")
//@Primary
public class MySQL implements DataBase{
	
	public void getData() {
		System.out.println("I am from MySQL Class");
	}
	
}
