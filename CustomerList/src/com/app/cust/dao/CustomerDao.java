package com.app.cust.dao;

import com.app.cust.model.Customer;

public interface CustomerDao {
	public Customer addCustomer(Customer cutomer);
	public Customer showCustomer(int custId);
	public Customer removeCustomer(int custId);

}
