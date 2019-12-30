package com.app.cust.dao;

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
		Session session=sessionFactory.getCurrentSession();
		session.save(cutomer);
		return cutomer;
	}

}
