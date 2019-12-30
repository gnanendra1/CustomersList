package com.app.cust.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.cust.dao.CustomerDao;
import com.app.cust.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDao cdao;
	
	@Override
	@Transactional
	public void addCustomer(Customer cutomer) {

		cdao.addCustomer(cutomer);
		
	}

}
