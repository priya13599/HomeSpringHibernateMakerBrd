package com.nucleus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	@RequestMapping("/loginform")
	public String request1()
	{
		return "loginform";
		
	}
	
	@RequestMapping("/defaultpage")
	public String request5(HttpServletRequest request)
	{
		String target="result";
		if(request.isUserInRole("ROLE_MAKER"))
			target="makerfunctions";
		else if(request.isUserInRole("ROLE_CHECKER"))
			target="adminfunctions";
		return target;

	}
	@RequestMapping("/logout")
	public String request7(HttpServletRequest request)
	{
		
		return "loginform";

	}
	
	
	/*@RequestMapping("/defaultpage")
	public String request5(HttpServletRequest request)
	{
		String target="result";
		if(request.isUserInRole("ROLE_USER"))
			target="makerfunctions";
		else if(request.isUserInRole("ROLE_ADMIN"))
			target="adminfunctions";
		return target;

	}*/
}
