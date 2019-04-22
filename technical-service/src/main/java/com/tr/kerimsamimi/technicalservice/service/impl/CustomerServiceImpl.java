package com.tr.kerimsamimi.technicalservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tr.kerimsamimi.technicalservice.dao.CustomerDao;
import com.tr.kerimsamimi.technicalservice.model.Customer;
import com.tr.kerimsamimi.technicalservice.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;

	@Override
	public Customer createCustomer(Customer customer) {
		
	return customerDao.save(customer);//customer oluşturur kaydeder.
	}

	@Override
	public Iterable<Customer> ListAllCustomer() {

		return  customerDao.findAll();//db'den customer bilgilerini çeker
	}

	@Override
	public Optional<Customer> findCustomerByNo(Integer customerNo) {
		return customerDao.findById(customerNo);//customerNo'ya göre customer'ları çeker
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	


}
