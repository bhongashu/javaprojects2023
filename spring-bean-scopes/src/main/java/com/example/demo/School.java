package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class School {
	
	@Autowired
	private Student student;
	
	public School() {
		
		System.out.println("School class called..");
	}

	public Student getStudent() {
		
		Student student=createStudentObject();
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	@Lookup
	public Student createStudentObject() {
		
		return null;
	}

}
