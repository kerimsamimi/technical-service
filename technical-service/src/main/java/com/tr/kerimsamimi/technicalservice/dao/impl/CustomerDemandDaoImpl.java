/*package com.tr.kerimsamimi.technicalservice.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tr.kerimsamimi.technicalservice.dao.CustomerDemandDao;
import com.tr.kerimsamimi.technicalservice.model.CustomerDemand;

//@Repository
public class CustomerDemandDaoImpl implements CustomerDemandDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void createCustomerDemand(CustomerDemand customerDemand) {
		sessionFactory.getCurrentSession().save(customerDemand);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerDemand> ListAllCustomerDemand() {
		return (List<CustomerDemand>) sessionFactory.getCurrentSession().createQuery("FROM Customer_Demand");
	}

	@Override
	public CustomerDemand ListCustomerDemandByNo(Integer productId) {
		return sessionFactory.getCurrentSession().get(CustomerDemand.class, productId);
	}

	@Override
	public void updateCustomerDemand(CustomerDemand customerDemand) {
		sessionFactory.getCurrentSession().update(customerDemand);
	}

	@Override
	public void deleteCustomerDemandByNo(CustomerDemand customerDemand) {
		sessionFactory.getCurrentSession().delete(customerDemand);
		
	}

}
*/