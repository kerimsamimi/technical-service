package com.tr.kerimsamimi.technicalservice.service;

import java.util.List;

import com.tr.kerimsamimi.technicalservice.model.CustomerDemandDto;

public interface TaskService {

	void assignTask(Integer workerId, Integer customerDemandId);
	List<CustomerDemandDto> getAssignedIssues(Integer workerId);
}
