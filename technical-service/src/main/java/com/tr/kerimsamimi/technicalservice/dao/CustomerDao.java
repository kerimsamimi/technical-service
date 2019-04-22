package com.tr.kerimsamimi.technicalservice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tr.kerimsamimi.technicalservice.model.Customer;


public interface CustomerDao extends CrudRepository<Customer, Integer>  {
	
	
	

}
