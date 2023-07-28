package com.junitmockito.junitmockitodemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.junitmockito.junitmockitodemo.entity.Book;
import com.junitmockito.junitmockitodemo.repository.BookRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {

	BookRepository bookRepository;
	
	public List<Book> getAllBooks() {
		
		return bookRepository.findAll();
	}

	public Book getBookById(long bookId) {
		
		return bookRepository.findById(bookId).get();
	}

	public Book addBook(Book book) {
		
		return bookRepository.save(book);
	}

}
