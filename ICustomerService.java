package com.nucleus.service;

import java.util.List;

import com.nucleus.model.Customer;

public interface ICustomerService {
	
	public void saveCustomer(Customer customer);
	public int deleteCustomer(Customer customer);
	public Customer displayCustomer(Customer customer);
	public List<Customer> displayCustomer1();
	public Customer updateCustomer(Customer customer);
	public void updateCustomerdetails(Customer customer2);
	public List<Customer> displayascendingorder();
	public List<Customer> displaydescendingorder();
	

}
