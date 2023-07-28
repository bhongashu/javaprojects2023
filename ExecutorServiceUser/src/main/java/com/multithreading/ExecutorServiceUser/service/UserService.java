package com.multithreading.ExecutorServiceUser.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.multithreading.ExecutorServiceUser.model.User;
import com.multithreading.ExecutorServiceUser.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	@Async
	public CompletableFuture<List<User>> saveUser(MultipartFile file){
		//List<User> list=parseCSVFile(file);
		return null;
	

	
	}

}
