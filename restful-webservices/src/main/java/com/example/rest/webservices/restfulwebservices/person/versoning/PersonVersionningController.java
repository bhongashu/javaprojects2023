package com.example.rest.webservices.restfulwebservices.person.versoning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersionningController {
	
	// Versioning using URI
	@GetMapping("/v1/person")
	public Person1 getPersonFirstVersion(){
		
		Person1 person = new Person1("Ashwini Bankar");
		
		return person;
	}
	
	@GetMapping("/v2/person")
	public Person2 getPersonSecondVersion(){
		
		Person2 person = new Person2("Ashwini","Bankar");
		
		return person;
	}
	
	//Versioning using request params
	
	@GetMapping(path="/person" , params="version-1")
	public Person1 getPersonFirstVersionRequestParam(){
		
		Person1 person = new Person1("Ashwini Bankar");
		
		return person;
	}
	
	@GetMapping(path="/person" , params="version-2")
	public Person2 getPersonSecondVersionRequestParam(){
		
		Person2 person = new Person2("Ashwini","Bankar");
		
		return person;
	}
	
	//Versioning using headers
	
	@GetMapping(path="/person", headers="X-API-VERSION=1")
	public Person1 getPersonFirstVersionHeaders(){
		
		Person1 person = new Person1("Ashwini Bankar");
		
		return person;
	}
	
	@GetMapping(path="/person", headers="X-API-VERSION=2")
	public Person2 getPersonSecondVersionHeaders(){
		
		Person2 person = new Person2("Ashwini","Bankar");
		
		return person;
	}
	
	//versioning using Media-Type
	
	@GetMapping(path="/person", produces="application/vnd.company.app-v1+json")
	public Person1 getPersonFirstVersionHeadersMediaType(){
		
		Person1 person = new Person1("Ashwini Bankar");
		
		return person;
	}
	
	@GetMapping(path="/person", produces="application/vnd.company.app-v2+json")
	public Person2 getPersonSecondVersionHeadersMediaType(){
		
		Person2 person = new Person2("Ashwini","Bankar");
		
		return person;
	}

}
