package com.excelr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.excelr.entity.Book;

@Controller
public class BookController {
	
/*	@GetMapping("/bookdetail")
	public String bookData(Model model) {
		Book b1 = new Book();
		model.addAttribute("book", b1);
		return "bookDetails";
	}
	
	@PostMapping("/bookHandle")
	public String bookHandle(Book book , Model model) {
		String res = "Book Details Saved Successfully";
		model.addAttribute("msg" , res);
		return "bookData";
	}
*/
	
	@GetMapping("/data")
	public String display(Model model) {
		String res = "Welcome to thyemleaf";
		model.addAttribute("msg" , res);
		return "displaydata";
	}
}
