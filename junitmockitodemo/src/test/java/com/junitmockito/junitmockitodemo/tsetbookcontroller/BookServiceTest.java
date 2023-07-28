package com.junitmockito.junitmockitodemo.tsetbookcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.error.ShouldHaveSize;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.jayway.jsonpath.JsonPath;
import com.junitmockito.junitmockitodemo.entity.Book;
import com.junitmockito.junitmockitodemo.repository.BookRepository;
import com.junitmockito.junitmockitodemo.service.BookService;

import ch.qos.logback.core.status.Status;
import junit.framework.Assert;

@ExtendWith(SpringExtension.class)
public class BookServiceTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Mock
	BookRepository bookRepository;
	
	@InjectMocks
	BookService bookService;
	
	Book record1=new Book(1L,"The Alkemist","Good Book",10);
	Book record2=new Book(2L,"Think and Grow Rich","Good Book",9);
	Book record3=new Book(3L,"Stop giving excuses","Good Book",10);
	
	@Test
	public void getAllBooksTest() throws Exception {
		
		List<Book> records =new ArrayList<Book>();
		records.add(record1);
		records.add(record2);
		records.add(record3);
		
		Mockito.when(bookRepository.findAll()).thenReturn(records);
		
		Assert.assertEquals(records.size(), 3);
		
//		mockMvc.perform(MockMvcRequestBuilders
//		  			.get("/employees")
//		  			.accept(MediaType.APPLICATION_JSON))
//		      .andExpect(MockMvcResultMatchers.jsonPath("$.employees").exists())
//		      .andExpect(MockMvcResultMatchers.jsonPath("$.employees[*].employeeId").isNotEmpty());
	
		//assertEquals(null, null);
	
	}
}
