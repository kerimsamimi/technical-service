package com.tr.kerimsamimi.technicalservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.tr.kerimsamimi.technicalservice.model.CustomerDemand;

public interface CustomerDemandDao extends CrudRepository<CustomerDemand, Integer>  {
	/*
	public void createCustomerDemand(CustomerDemand customerDemand);
	public List<CustomerDemand> ListAllCustomerDemand();
	public CustomerDemand ListCustomerDemandByNo(Integer productId);
	public void updateCustomerDemand(CustomerDemand customerDemand);
	public void deleteCustomerDemandByNo(CustomerDemand customerDemand);
*/
}
