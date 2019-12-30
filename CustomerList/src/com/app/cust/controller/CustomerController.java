package com.app.cust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.cust.model.Customer;
import com.app.cust.service.CustomerService;
@Controller
public class CustomerController {
	@Autowired
	private CustomerService cs;
	@RequestMapping("/")
	public String hello(Model model){
		model.addAttribute("customer",new Customer());
		
		return"c_registerform";
	}
	@RequestMapping("/addcustomer")
	public String saveCustomer(@ModelAttribute("cutomer") Customer cutomer){
		
		cs.addCustomer(cutomer);
		
		return "success";
	}

}
