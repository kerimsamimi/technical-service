package com.tr.kerimsamimi.technicalservice.model;

import java.io.Serializable;
import java.util.Date;

import com.tr.kerimsamimi.technicalservice.model.enums.DiscussionType;

public class CustomerDemandDto implements Serializable {

	private static final long serialVersionUID = -7067892828962253929L;
	private Integer customerDemandId; //veritabanindaki id field ına denk
	private Product product;
	private Date maintananceDate;
	private DiscussionType disType;
	private String changedPart; 
	private String status;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Date getMaintananceDate() {
		return maintananceDate;
	}
	public void setMaintananceDate(Date maintananceDate) {
		this.maintananceDate = maintananceDate;
	}
	public DiscussionType getDisType() {
		return disType;
	}
	public void setDisType(DiscussionType disType) {
		this.disType = disType;
	}
	public String getChangedPart() {
		return changedPart;
	}
	public void setChangedPart(String changedPart) {
		this.changedPart = changedPart;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getCustomerDemandId() {
		return customerDemandId;
	}
	public void setCustomerDemandId(Integer customerDemandId) {
		this.customerDemandId = customerDemandId;
	}
}
