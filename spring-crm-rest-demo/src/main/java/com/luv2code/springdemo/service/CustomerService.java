package com.luv2code.springdemo.service;

import java.util.List;
import java.util.Map;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.hacker;
import com.luv2code.springdemo.entity.lines;

public interface CustomerService {

	public List<Customer> listCustomers(String cookie,int sLimit,int eLimit);

	public Customer saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public int deleteCustomer(String cookie,int theId);
	
	public Object checkCustomerlogin(String mobilenumber);
	
	
	
//*****hackers things
	
	public List<hacker> getHackers();
	
	public hacker savehacker(hacker thehacker);

	public hacker getaHacker(int theId);

	public int deletehacker(int theId);
	
	public Map<String,String> checkHackerlogin(String mobilenumber,String pwd);
	
	
	//line things
	
	public List customersInLines(String cookie);
	
	public List<lines> listOfLines(String cookie);
	
	public lines newLine(lines thelines,String cookie);
	
	public lines updateLine(lines thelines,String cookie);
 
	public int removeLine(int id,String cookie);
	
}
