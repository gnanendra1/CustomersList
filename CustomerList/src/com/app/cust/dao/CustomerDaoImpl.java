package com.app.cust.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.cust.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	
	private SessionFactory sessionFactory;
	@Autowired
	 public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Customer addCustomer(Customer cutomer) {
		Session session=sessionFactory.openSession();
		session.save(cutomer);
		return cutomer;
	}
	
	public List<Customer> getCustomers() {
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("from Customer");
		@SuppressWarnings("unchecked")
		List<Customer> details = query.list();
		return details;
	}

	@Override
	public Customer updateCustomer(int cId) {

		Session session =sessionFactory.getCurrentSession();
		Customer customer=(Customer) session.get(Customer.class,cId);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Session session =sessionFactory.getCurrentSession();
		session.update(customer);
		return customer;
	}

	@Override
	public void deleteCustomers(int cId) {
		Session session =sessionFactory.getCurrentSession();
		Customer customer=(Customer) session.get(Customer.class, cId);
		session.delete(customer);
		
	}
}
