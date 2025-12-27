package com.excelr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.excelr.entity.Product;
import com.excelr.repo.ExcelrRepo;

@SpringBootApplication
public class SpringBootDataJpaTimeStampingAppApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringBootDataJpaTimeStampingAppApplication.class, args);
		
		ExcelrRepo repo = con.getBean(ExcelrRepo.class);
		
		Product p1 = new Product();
		p1.setProductName("Shoes");
		p1.setProductPrice(7000);
		repo.save(p1);
		
		p1.setProductId(1);
		p1.setProductName("Car");
		p1.setProductPrice(899999);
		repo.save(p1);
	}

}
