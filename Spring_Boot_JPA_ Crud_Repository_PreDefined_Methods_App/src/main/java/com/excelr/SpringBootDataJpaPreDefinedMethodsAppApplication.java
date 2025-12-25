package com.excelr;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.excelr.entity.Employee;
import com.excelr.repo.ExcelrRepo;

@SpringBootApplication
public class SpringBootDataJpaPreDefinedMethodsAppApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringBootDataJpaPreDefinedMethodsAppApplication.class, args);
		
		ExcelrRepo repo = con.getBean(ExcelrRepo.class);
		Employee e1 = new Employee();
		
		// save()
//		e1.setEmpName("Ramu");
//		e1.setEmpNo(101);
//		e1.setEmpSal(10000);
//		repo.save(e1);
//		System.out.println("Data Saved Successfully");
	
		// saveAll()
//		Employee e2 = new Employee(102, "Kumar", 20000);
//		Employee e3 = new Employee(103, "Venkat", 35000);
//		Employee e4 = new Employee(104, "Vishal", 50000);
//		repo.saveAll(Arrays.asList(e2, e3, e4));
//		System.out.println("Multiple Data Saved");
	
		// findById()
//		Optional<Employee> res = repo.findById(102);
//		System.out.println(res.get());
//		if(res.isPresent()) {
//			System.out.println("Data is Present");
//		} else {
//			System.out.println("Data not Present");
//		}
		
		// findAllById()
//		Iterable<Employee> res = repo.findAllById(Arrays.asList(102, 103, 104));
//		res.forEach(x -> System.out.println(x));
		
		// findAll()
//		Iterable<Employee> res = repo.findAll();
//		res.forEach(x -> System.out.println(x));
		
		// deleteById()
//		repo.deleteById(102);
//		System.out.println("Data Deleted");
	
		// count()
//		long res = repo.count();
//		System.out.println(res);
		
		// existsById()
//		boolean res1 = repo.existsById(103);
//		System.out.println(res1);
		
		// deleteAllById()
//		repo.deleteAllById(Arrays.asList(103, 104));
//		System.out.println("Multiple Records Deleted");
		
		// deleteAll()
//		repo.deleteAll();
//		System.out.println("All the Records Deleted");
		
		//findBy() // create methods in Main java file
		List<Employee> res = repo.findByEmpName("Kumar");
		res.forEach(x -> System.out.println(x));
		List<Employee> res1 = repo.findByEmpNameAndEmpNo("Ramu" , 101);
		res1.forEach(x -> System.out.println(x));
		List<Employee> res2 = repo.findByEmpSalGreaterThan(20000);
		res2.forEach(x -> System.out.println(x));
	}

}
