package com.tr.kerimsamimi.technicalservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tr.kerimsamimi.technicalservice.model.CustomerDemand;
import com.tr.kerimsamimi.technicalservice.model.CustomerDemandDto;
import com.tr.kerimsamimi.technicalservice.service.CustomerDemandService;
import com.tr.kerimsamimi.technicalservice.service.TaskService;

@RestController
public class RepairController {

	@Autowired
	private TaskService taskService;
	
	@Autowired
	private CustomerDemandService customerDemandService;
	
	@GetMapping(path="/techinal-service/worker/{id}")
	public void showWorkerPage(@PathVariable Integer id) {
		
	}
	
	@GetMapping(path="/techinal-service/show-inprogress-issues")
	public List<CustomerDemand> showInProgressIssues(){
		return customerDemandService.getCustomerDemands();
	}
	
	@GetMapping(path="/techinal-service/show-up-to-date-issues")
	public List<CustomerDemand> showUpToDateIssues(){
		return customerDemandService.getUpToDateIssues();
	}
	
	@PostMapping(path="/techinal-service/demand/{customerDemandId}/worker/{workerId}")
	public void assignTask(@PathVariable Integer workerId, @PathVariable Integer customerDemandId) {
		taskService.assignTask(workerId, customerDemandId);
	}
	
	@GetMapping(path="/techinal-service/worker/{id}/issues")
	public void listAssignedTasks(@PathVariable Integer id) {
		taskService.getAssignedIssues(id);
	}
	
	@PostMapping(path="/techinal-service/demand/{customerDemandId}/repair")
	public void repairDemand(@PathVariable Integer customerDemandId) {
		customerDemandService.repair(customerDemandId);
	}
	
}
