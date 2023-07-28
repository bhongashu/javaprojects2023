package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
@Configuration
public class SpringBeanScopesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanScopesApplication.class, args);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		

		context.getBean("singletonDemo",SingletonDemo.class);
		
	}

}
