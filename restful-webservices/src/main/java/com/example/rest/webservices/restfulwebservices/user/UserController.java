package com.example.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.rest.webservices.restfulwebservices.user.exception.UserNotFoundException;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService userDaoService;
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		
		List<User> users=userDaoService.findAll();
		
		return users;
	}
	
	@GetMapping("/users/{id}")
	public EntityModel<User> retrieveOne(@PathVariable int id) {
		User user=userDaoService.findById(id);
		
		if(user==null) {
			throw new UserNotFoundException(id+"Not Found");
		}
		
		EntityModel<User> entityModel=EntityModel.of(user);
		WebMvcLinkBuilder link= WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass())
												 .retrieveAllUsers());
		entityModel.add(link.withRel("all-users"));
		return entityModel;
	}
	
	@PostMapping("/add-users")
	public User addUser(@RequestBody User user) {
		
		User savedUser=userDaoService.addUser(user);
		return savedUser;
		
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> addUserWithCreatedRespose(@Valid @RequestBody User user){
		
		User savedUser=userDaoService.addUser(user);
		
		URI location=ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId()).toUri();
		
		
		return ResponseEntity.created(location).build();
		
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		
		userDaoService.deleteById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
