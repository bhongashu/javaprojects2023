package com.example.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.webservices.restfulwebservices.bean.HelloWorldBean;

@RestController
public class HelloWorldController {
	
@GetMapping("/helloworld")
public String helloWorld() { 
	
	return "HelloWorld";
}


@GetMapping("/helloworldbean")
public HelloWorldBean returnhelloWorldBean() {
	
	return new HelloWorldBean("HelloWorld");
}

@GetMapping("/hello-world-path-variable/{name}")
public HelloWorldBean helloWorlPathVariable(@PathVariable String name) {
	
	return new HelloWorldBean("Hello-World"+name);
}
}
