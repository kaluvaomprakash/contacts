package com.luv2code.springdemo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.dao.hackersDaoimp;
import com.luv2code.springdemo.dao.linesDAOimp;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.hacker;
import com.luv2code.springdemo.entity.lines;

@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private hackersDaoimp hakcerdao;
	
	@Autowired
	private linesDAOimp linesdaoimp;
	
	
	
	@Override
	@Transactional
	public List<Customer> listCustomers(String cookie,int sLimit,int eLimit) {
		return customerDAO.listCustomers(cookie,sLimit,eLimit);
	}

	@Override
	@Transactional
	public Customer saveCustomer(Customer theCustomer) {

		return customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public int deleteCustomer(String cookie,int theId) {
		
		return customerDAO.deleteCustomer(cookie,theId);
	}

	@Override
	@Transactional
	public Object checkCustomerlogin(String mobilenumber) {
		return customerDAO.customerLoginCheck(mobilenumber);
	}

	
	// **** All hacker things start from here
	
	@Override
	@Transactional
	public List<hacker> getHackers() {
		return hakcerdao.allHackers();
	}

	@Override
	@Transactional
	public hacker savehacker(hacker thehacker) {
		return hakcerdao.savehacker(thehacker);
	}

	@Override
	@Transactional
	public hacker getaHacker(int theId) {
		return hakcerdao.getahacker(theId);
	}

	@Override
	@Transactional
	public int deletehacker(int theId) {
		return hakcerdao.deleteahacker(theId);
	}

	@Override
	@Transactional
	public Map<String,String> checkHackerlogin(String mobilenumber,String pwd) {
		System.out.println(mobilenumber+" "+pwd);
		return hakcerdao.hackerLoginCheck(mobilenumber,pwd);
	}

	@Override
	@Transactional
	public List customersInLines(String cookie) {
		return linesdaoimp.customersInLines(cookie);
	}

	@Override
	@Transactional
	public List<lines> listOfLines(String cookie) {
		return linesdaoimp.listLines(cookie);
	}

	@Override
	@Transactional
	public lines newLine(lines thelines, String cookie) {
		return linesdaoimp.newLine(thelines, cookie);
	}

	@Override
	@Transactional
	public lines updateLine(lines thelines, String cookie) {
		return linesdaoimp.updateLine(thelines, cookie);
	}

	@Override
	public int removeLine(int id, String cookie) {
		// TODO Auto-generated method stub
		return linesdaoimp.removeLine(id, cookie);
	}

	
}





