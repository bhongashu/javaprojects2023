package com.multithreading.ExecutorServiceUser.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private int id;
	private String name;
	private String email;
	private String gender;

}
