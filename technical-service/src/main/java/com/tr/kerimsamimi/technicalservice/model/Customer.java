package com.tr.kerimsamimi.technicalservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer customerNo;
	
	
	@Column
	private String customerName;
	
	public Integer getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(Integer customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
