package com.nucleus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.model.User;

public class AdminController {
	
	@RequestMapping("/registeruserform")
	public ModelAndView request1(User user)
	{
		System.out.println("Priya");
		return new ModelAndView("registeruserform");
	}

}
