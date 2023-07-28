package com.example.springsecurity.customer;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping("/welcome")
	public String getMessage() {
		
		return "Welcome to the customer application";
		
	}
	
	@GetMapping("/getcustomer/id")
	//@PreAuthorize("hasAuthority('ROLE_USER','ROLE_ADMIN')")
	public String getCustomerById(@PathVariable int id) {
		
		return "This is getCustomerByIDMethod";
	}
	
	@GetMapping("/all")
	//@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String getAllCustomers() {
		
		return "This is getAllCustomers";
	}

}
