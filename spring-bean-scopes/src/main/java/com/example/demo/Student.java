package com.example.demo;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
@Scope(value="prototype")
public class Student {
	
	private String name;
	
	public Student() {
		
		System.out.println("Student class called..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
