package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/Customers")
public class customerController {
	
	@Autowired
	private CustomerService customerservice;

	
	@GetMapping("/clist/{slit}/{elit}")
	public List<Customer> getCustomers(@CookieValue(value = "PPtoken") String cookie,@PathVariable int slit,@PathVariable int elit){
	return customerservice.listCustomers(cookie,slit,elit);
	}
	

	
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerservice.getCustomer(id);
	}
	@PostMapping("/save")
	public Customer addCustomer(@RequestBody Customer theCustomer) {
		theCustomer.setId(0);
		return customerservice.saveCustomer(theCustomer);
	}
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer theCustomer) {
		return customerservice.saveCustomer(theCustomer);
	}
	
	@PostMapping("/d/{theId}")
	public int deleteCustomer(@CookieValue(value = "PPtoken") String cookie,@PathVariable int theId) {
		return customerservice.deleteCustomer(cookie,theId);
		
	}
	
	@GetMapping("/check/{mNumber}")
	public Object customerCheck(@PathVariable String mNumber) {
		return customerservice.checkCustomerlogin(mNumber);
		
	}
	
	
}
