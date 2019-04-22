package com.tr.kerimsamimi.technicalservice.model;

import java.io.Serializable;

public class ProductDto implements Serializable {

	private static final long serialVersionUID = -6999659148231192848L;
	private Integer no;
	private String serialNo;
	private String productTitle;
	private Customer customer;
	
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
