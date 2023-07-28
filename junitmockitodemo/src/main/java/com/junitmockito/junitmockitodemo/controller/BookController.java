package com.junitmockito.junitmockitodemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junitmockito.junitmockitodemo.entity.Book;
import com.junitmockito.junitmockitodemo.service.BookService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {
	
	BookService bookService;
	
	@GetMapping
	public List<Book> getAllBooks(){
		
		return bookService.getAllBooks();
	}
	
	@GetMapping("{bookId}")	
	public Book getBookById(@PathVariable long bookId) {
		
		return bookService.getBookById(bookId);
	}
	
	@PostMapping
	public Book addBook(@RequestBody Book book) {
		
		return bookService.addBook(book);
	}
	

}
