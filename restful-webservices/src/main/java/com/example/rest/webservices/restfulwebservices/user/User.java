package com.example.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

//@JsonIgnoreProperties({"id","birthdate"})

@Entity(name="user_details")
public class User {
	
	public User() {
		
	}
	
	@Id
	@NotNull(message="Id should not be null")
	private int id;
	
	@Size(min=2 , message="Name should have atleast two characters")
	@JsonProperty("user-name")
	private String name;
	
	@Past(message="Birthdate should be in past")
	//@JsonIgnore
	private LocalDate birthdate;

	public User(int id,String name,LocalDate birthdate) {
		
		this.id=id;
		this.name=name;
		this.birthdate=birthdate;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
	}

}
