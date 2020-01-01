package com.app.cust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.cust.model.Customer;
import com.app.cust.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService cs;

	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("customer", new Customer());
		return "c_registerform";
	}

	@RequestMapping("/addcustomer")
	public String saveCustomer(@ModelAttribute("cutomer") Customer cutomer) {
		cs.addCustomer(cutomer);
		return "success";
	}
	@RequestMapping("/getAll")
	public String getCustomers(Model model) {
		model.addAttribute("customer",cs.getCustomers());
		return "get_custmers";
	}
	@RequestMapping(value="/updateCustomer",method=RequestMethod.POST)
	public String updateCustomers(@ModelAttribute("cutomer1") Customer cutomer) {
		cs.updateCustomer(cutomer);
		return "updated";
	}
	@RequestMapping("/showFormForUpdate")
	public String updateCustomers(@RequestParam("customerId") int cId,Model model) {
		model.addAttribute("customer",cs.updateCustomer(cId));
		return "c_update";
	}
	@RequestMapping("/showFormForRemove")
	public String deleteCustomers(@RequestParam("customerId") int cId) {
			cs.deleteCustomers(cId);
		return "redirect:/getAll";
	}
}
