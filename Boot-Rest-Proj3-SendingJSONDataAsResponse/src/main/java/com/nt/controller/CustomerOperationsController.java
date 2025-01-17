package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController

public class CustomerOperationsController {

	@GetMapping("/show")
	public ResponseEntity<Customer> showData()
	{
		return new ResponseEntity<Customer>(new Customer(101,"Surya","jspur"),HttpStatus.OK);
	}
	
	@PostMapping("/show")
	public String registerCustomer(@RequestBody Customer cust)
	{
		return cust.toString();
	}

}
