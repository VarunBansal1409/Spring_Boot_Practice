package com.excelr.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.excelr.entity.Employee;

public interface ExcelrRepo extends CrudRepository<Employee, Integer>{

	// create a findBy() methods
	
	public List<Employee> findByEmpName(String empName);

	public List<Employee> findByEmpNameAndEmpNo(String empName, Integer empNo);

	public List<Employee> findByEmpSalGreaterThan(Integer empSal);
} 
