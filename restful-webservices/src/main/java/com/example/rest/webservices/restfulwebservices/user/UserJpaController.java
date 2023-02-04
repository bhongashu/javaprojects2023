package com.example.rest.webservices.restfulwebservices.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.webservices.restfulwebservices.user.exception.UserNotFoundException;

@RestController
public class UserJpaController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/jpa/users")
	public List<User> retrieveAll(){
		
		List<User> users=userRepository.findAll();
		return users;
		
	}
	
	@GetMapping("/jpa/user/{id}")
	public EntityModel<User> retrieveOne(@PathVariable int id) {
		
		Optional<User> optionalUser=userRepository.findById(id);
		
		if(optionalUser.isEmpty()) {
			
			throw new UserNotFoundException(id+"Not found");
		}
		User user= optionalUser.get();
		
		EntityModel<User> entityModel= EntityModel.of(user);
		WebMvcLinkBuilder link= WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass())
				.retrieveAll());
		entityModel.add(link.withRel("all-users"));
		return entityModel;
		
	}

}
