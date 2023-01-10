package com.example.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.rest.webservices.restfulwebservices.user.exception.UserNotFoundException;

@Component
public class UserDaoService {
	
	
	private static List<User> users=new ArrayList<>();
	
	static {
		
		users.add(new User(1,"Ashwini",LocalDate.now().minusYears(29)));
		users.add(new User(2,"Prashant",LocalDate.now().minusYears(32)));
		users.add(new User(3,"Dnyanesh",LocalDate.now().minusYears(2)));
		
	}


	public List<User> findAll(){
		return users;
		
	}
	
	public User findById(int id) {
		
	return users.stream().filter(user->user.getId()==id).findFirst().orElse(null);
	}

	public User addUser(User user) {
		
		boolean isAddedUser=users.add(user);
		System.out.println(users);
		if(isAddedUser==true) {
			return user;
		}
		else return null;
	}
	
	public void deleteById(int id) {

		users.removeIf(user->user.getId()==id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
