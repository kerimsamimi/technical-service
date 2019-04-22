package com.tr.kerimsamimi.technicalservice.service;

import java.util.List;

import com.tr.kerimsamimi.technicalservice.model.CustomerDemand;

public interface CustomerDemandService {
	List<CustomerDemand> getCustomerDemands();
	List<CustomerDemand> getUpToDateIssues();
	void repair(Integer id);
}
