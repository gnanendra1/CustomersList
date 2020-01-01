package com.app.cust.service;

import java.util.List;

import com.app.cust.model.Customer;

public interface CustomerService {

	public void addCustomer(Customer cutomer);
	public List<Customer> getCustomers();
	public Customer updateCustomer(int cId);
	public Customer updateCustomer(Customer cutomer);
	public void deleteCustomers(int cId);

}
