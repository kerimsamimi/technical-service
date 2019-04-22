package com.tr.kerimsamimi.technicalservice.service;

import java.util.Optional;
import com.tr.kerimsamimi.technicalservice.model.Customer;
public interface CustomerService  {
	public Customer createCustomer(Customer customer);
	public Iterable<Customer> ListAllCustomer();
	public Optional<Customer> findCustomerByNo(Integer customerNo);
	public Customer updateCustomer(Customer customer);
	
}
