package com.app.cust.service;

import java.util.List;

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
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		List<Customer> customer=cdao.getCustomers();
		return customer;
	}
	@Override
	@Transactional
	public Customer updateCustomer(int cId) {
		Customer customer=cdao.updateCustomer(cId);
		return customer;
	}
	@Override
	@Transactional
	public Customer updateCustomer(Customer cutomer) {
		Customer customer=cdao.updateCustomer(cutomer);
		return customer;
	}
	@Override
	@Transactional
	public void deleteCustomers(int cId) {
		cdao.deleteCustomers(cId);
	}
}
