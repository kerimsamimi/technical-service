package com.tr.kerimsamimi.technicalservice.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product implements Serializable{

	private static final long serialVersionUID = -6260970213887427668L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer no;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Customer customer;
	
	@Column
	private String serialNo;
	
	@Column
	private String productTitle;
	
	
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
