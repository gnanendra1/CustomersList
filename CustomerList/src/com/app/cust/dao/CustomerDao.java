package com.app.cust.dao;

import com.app.cust.model.Customer;

public interface CustomerDao {
	public Customer addCustomer(Customer cutomer);
	public Customer show(int cutomerId);
	public Customer removeCustomer(int cutomerId);	

}
