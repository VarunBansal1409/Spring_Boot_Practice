package com.excelr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.excelr.DAO.DataBase;

@Service
public class ExcelRService {

	@Autowired	// Field
	@Qualifier("mysql")
	private DataBase db;
	
	public void m1() {
		System.out.println("I am from ExcelRService Class");
		db.getData();
	}
	
}
