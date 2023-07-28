package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
@Configuration
public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		School school=context.getBean(School.class, "school");
		Student student =school.getStudent();
		student.setName("Ashwini");
		
		School school1=context.getBean(School.class, "school");
		Student student1 =school.getStudent();
		System.out.println(student1.getName());
		
	}

}
