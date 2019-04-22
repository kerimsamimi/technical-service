//package com.tr.kerimsamimi.technicalservice.dao.impl;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import com.tr.kerimsamimi.technicalservice.dao.CustomerDao;
//import com.tr.kerimsamimi.technicalservice.model.Customer;
//
//@Repository
//public class CustomerDaoImpl implements CustomerDao {
//	
//
//	@Override
//	public void createCustomer(Customer customer) {
//	
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Customer> ListAllCustomer() {
//		return null;//return (List<Customer>) sessionFactory.getCurrentSession().createQuery("FROM Customer");
//	}
//
//	@Override
//	public Customer ListCustomerByNo(Integer customerNo) {
//		return null; //return sessionFactory.getCurrentSession().get(Customer.class, customerNo);
//	}
//
//	@Override
//	public void updateCustomer(Customer customer) {
//		//sessionFactory.getCurrentSession().update(customer);
//	}
//
//	@Override
//	public void deleteCustomerByNo(Customer customer) {
//		//sessionFactory.getCurrentSession().delete(customer);		
//	}
//
//}
