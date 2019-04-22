package com.tr.kerimsamimi.technicalservice.request;

public class AssignTaskRequest extends BaseRequest{

	private static final long serialVersionUID = 5227947716071852564L;
	private Integer workerId;
	private Integer customerDemandId;
	
	public Integer getWorkerId() {
		return workerId;
	}
	public void setWorkerId(Integer workerId) {
		this.workerId = workerId;
	}
	public Integer getCustomerDemandId() {
		return customerDemandId;
	}
	public void setCustomerDemandId(Integer customerDemandId) {
		this.customerDemandId = customerDemandId;
	}
}
