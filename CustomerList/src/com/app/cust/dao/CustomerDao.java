package com.app.cust.dao;

import java.util.List;

import com.app.cust.model.Customer;

public interface CustomerDao {
	public Customer addCustomer(Customer cutomer);
	public List<Customer> getCustomers();
	public Customer updateCustomer(int cId);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomers(int cId);
}
