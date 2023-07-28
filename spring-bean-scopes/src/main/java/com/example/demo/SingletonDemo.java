package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class SingletonDemo {
	
	@Autowired
	private Employee employee;
	
	public SingletonDemo() {
		
		System.out.println("SinletonDemo called..");
	}
	

}
