package com.nucleus.controller;

import java.security.Principal;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.dao.ICustomerDao;
import com.nucleus.model.Customer;
import com.nucleus.model.Role;
import com.nucleus.model.User;
import com.nucleus.service.ICustomerService;


@Controller
public class UserController {
	
	@Autowired
	ICustomerDao customerDao;
	@Autowired
	ICustomerService customerService;
	
	Date date = new Date();
	@RequestMapping("/insertcustomerdetailsform")
	public ModelAndView request1(Customer customer)
	{
		return new ModelAndView("insertcustomerdetailsform");
	}
	
	
	@RequestMapping("/insertCustomer")
	public ModelAndView request2(@Valid Customer customer,BindingResult result,Principal principal)
	{
		
		if(result.hasErrors())
		{
			return new ModelAndView("insertcustomerdetailsform");
		}
		customer.setRecordStatus("N");
		customer.setCreateDate(date);
		customer.setCreatedBy(principal.getName());
		
		ModelAndView model = new ModelAndView();
		customerService.saveCustomer(customer);
		model.addObject("flag","Record Inserted Successfully");
		model.setViewName("insertcustomerdetailsform");
		return model;
         
		
	}
	
	
	@RequestMapping("/deletecustomerdetailsform")
	public ModelAndView request3(Customer customer)
	{
		return new ModelAndView("deletecustomerdetailsform");
	}

	
	@RequestMapping("/deleteCustomer")
	public ModelAndView request4(@Valid Customer customer,BindingResult result)
	{
		ModelAndView model = new ModelAndView();
		int flag = customerService.deleteCustomer(customer);
		if(flag==0)
		{
		
		model.addObject("flag","Record Deleted Successfully");
		model.setViewName("deletecustomerdetailsform");
		return model;
		}
		else
		{
			model.addObject("flag","No Such Record Found In Database");
			model.setViewName("deletecustomerdetailsform");
			return model;
		}
		
	}
	
	
	
	@RequestMapping("/displaycustomerdetailsform")
	public ModelAndView request5(Customer customer)
	{
		return new ModelAndView("displaycustomerdetailsform");
	}
	
	
	@RequestMapping("/displayCustomer")
	public ModelAndView request6(@Valid Customer customer,BindingResult result)
	{
		ModelAndView model = new ModelAndView();
		Customer customer1 = customerService.displayCustomer(customer);
		if(customer1!=null)
		{
		
		model.addObject("flag","sn1");
		model.addObject("customer",customer1);
		model.setViewName("displaycustomerdetails");
		return model;
		}
		else
		{
			model.addObject("flag","No Such Record Found In Database");
			model.setViewName("displaycustomerdetailsform");
			return model;
			
		}
		
	}
	
	
	@RequestMapping("/displaycustomerdetailsform1")
	public ModelAndView request7(Customer customer)
	{
		return new ModelAndView("displaycustomerdetailsform1");
	}
	
	
	@RequestMapping("/displayCustomers")
	public ModelAndView request8(@Valid Customer customer,BindingResult result)
	{
		
		List<Customer> customer1 = customerService.displayCustomer1();
		ModelAndView model = new ModelAndView();
		model.addObject("flag","sn2");
		model.addObject("customer",customer1);
		model.setViewName("displaycustomerdetails");
		return model;
		
	}
	
	
	@RequestMapping("/updatecustomerdetailsform")
	public ModelAndView request11(Customer customer)
	{
		return new ModelAndView("updatecustomerdetailsform");
	}
	
	@RequestMapping("/updateCustomer")
	public ModelAndView request12(@Valid Customer customer,BindingResult result)
	{
		ModelAndView model = new ModelAndView();
		
		Customer customer1 =customerService.updateCustomer(customer);
		if(customer1!=null)
		{
		model.addObject("customer",customer1);
		model.setViewName("updatecustomerdetails");
		return model;
		}
		else
		{
			model.addObject("flag","No Such Record Found In Database");
			model.setViewName("updatecustomerdetailsform");
			return model;
		}
	}
	
	
	@RequestMapping("/updateCustomerDetails")
	public ModelAndView request13(@Valid Customer customer,BindingResult result,Principal principal)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("updatecustomerdetailsform");
		}
		customer.setRecordStatus("N");
		customer.setCreateDate(date);
		customer.setCreatedBy(principal.getName());
		
		ModelAndView model = new ModelAndView();
		customerService.updateCustomerdetails(customer);
		Customer cust = new Customer();
		model.addObject("customer",cust);
		model.addObject("flag","Record Updated Successfully");
		model.setViewName("updatecustomerdetails");
		return model;
        
	}
	
	
	@RequestMapping("/ascendingorder")
	public ModelAndView request9()
	{
		List<Customer> customer =customerService.displayascendingorder();
		ModelAndView model = new ModelAndView();
		model.addObject("flag","sn2");
		model.addObject("customer",customer);
		model.setViewName("displaycustomerdetails");
		return model;
	}
	
	
	@RequestMapping("/descendingorder")
	public ModelAndView request10()
	{
		List<Customer> customer =customerService.displaydescendingorder();
		ModelAndView model = new ModelAndView();
		model.addObject("flag","sn2");
		model.addObject("customer",customer);
		model.setViewName("displaycustomerdetails");
		return model;
	}
	

	@RequestMapping("/registeruserform")
	public ModelAndView request1(User user,Role role)
	{
		System.out.println("Priya");
		return new ModelAndView("registeruserform");
	}

}