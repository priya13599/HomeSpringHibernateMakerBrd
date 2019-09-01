package com.nucleus.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nucleus.dao.ICustomerDao;
import com.nucleus.model.Customer;
@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	ICustomerDao customerDao;
	
	
	@Override
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
		
	
	}


	@Override
	public int deleteCustomer(Customer customer) {
		int flag = customerDao.deleteCustomer(customer);
		return flag;
	}


	@Override
	public Customer displayCustomer(Customer customer) {
	Customer customer1 = customerDao.displayCustomer(customer);
		return customer1;
	}


	@Override
	public List<Customer> displayCustomer1() {
		List<Customer> customer =customerDao.displayCustomer1();
		return customer;
	}


	@Override
	public Customer updateCustomer(Customer customer) {
		Customer customer1=customerDao.updateCustomer(customer);
		return customer1;
	}


	@Override
	public void updateCustomerdetails(Customer customer2) {
		customerDao.updateCustomerdetails(customer2);
		
	}


	@Override
	public List<Customer> displayascendingorder() {
		List<Customer>customer=customerDao.displayascendingorder();
		return customer;
	}


	@Override
	public List<Customer> displaydescendingorder() {
		List<Customer> customer = customerDao.displaydescendingorder();
		return customer;
	}
	
	
	
	
	
	/*
	@Override
	public int saveCustomer(Customer customer) {
		int flag =customerDao.saveCustomer(customer);
		return flag;
	}

	@Override
	public int deleteCustomer(Customer customer) {
		int flag =customerDao.deleteCustomer(customer);
		return flag;
	}

	@Override
	public Customer displayCustomer(Customer customer) {
		Customer customer1 = customerDao.displayCustomer(customer);
		return customer1;
	}

	@Override
	public List<Customer> displayCustomer1(Customer customer) {
		List<Customer> list = customerDao.displayCustomer1(customer);
		return list;
	}

	@Override
	public List<Customer> sortinascending() {
		List<Customer> list = customerDao.sortinascending();
		return list;
	}

	@Override
	public List<Customer> sortindescending() {
		List<Customer> list = customerDao.sortindescending();
		return list;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer customer1= customerDao.updateCustomer(customer);
		return customer1;
	}

	@Override
	public void updateCustomerdetails(Customer customer2) {
		customerDao.updateCustomerdetails(customer2);
		
	}*/

}
