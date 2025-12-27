package com.excelr;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import com.excelr.entity.ExcelrEntity;
import com.excelr.repo.ExcelrRepo;

@SpringBootApplication
public class SpringBootDataJpaSortingAppApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringBootDataJpaSortingAppApplication.class, args);
	
		ExcelrRepo repo = con.getBean(ExcelrRepo.class);
		
		ExcelrEntity e1 = new ExcelrEntity(101, "ramju" , 1000);
		ExcelrEntity e2 = new ExcelrEntity(102, "somu" , 2000);
		ExcelrEntity e3 = new ExcelrEntity(103, "janu" , 1500);
		ExcelrEntity e4 = new ExcelrEntity(104, "monu" , 1010);
		ExcelrEntity e5 = new ExcelrEntity(105, "banu" , 3000);
		
		repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5));
		System.out.println("Data Saved Successfully");
	
	
		// print data from ascending order to descending order
		List<ExcelrEntity> res = repo.findAll(Sort.by("empSal"));
		res.forEach(x -> System.out.println(x));

		// print data from descending order to ascending order
		List<ExcelrEntity> res1 = repo.findAll(Sort.by("empSal").descending());
		res1.forEach(x -> System.out.println(x));
		
		
//		ExcelrEntity e6 = new ExcelrEntity();
//		e6.setEndId(106);
//		e6.setEmpName("kanu");
//		e6.setEmpSal(2500);
//		Example<ExcelrEntity> res2 = Example.of(e6);
//		List<ExcelrEntity> res3 = repo.findAll(res2);
//		res3.forEach(x -> System.out.println(x));
	
	
	}

}
