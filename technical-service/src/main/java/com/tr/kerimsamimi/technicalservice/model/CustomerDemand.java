package com.tr.kerimsamimi.technicalservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tr.kerimsamimi.technicalservice.model.enums.DiscussionType;

@Entity
@Table(name="Customer_Demand")
public class CustomerDemand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer customerDemandId;
	
	@ManyToOne
	private Product product;
	
	@Column
	private Date maintananceDate;
	
	@Column
	private DiscussionType disType;
	
	@Column
	private String changedPart; //, status
	
	@Column
	private String status;
	
	
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
	
	
	public Integer getCustomerDemandId() {
		return customerDemandId;
	}
	public void setCustomerDemandId(Integer customerDemandId) {
		this.customerDemandId = customerDemandId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
