package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Product;

public interface ExcelrRepo extends JpaRepository<Product, Integer>{
	
}
