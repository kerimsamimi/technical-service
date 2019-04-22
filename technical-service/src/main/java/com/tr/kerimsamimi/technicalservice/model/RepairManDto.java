package com.tr.kerimsamimi.technicalservice.model;

import java.io.Serializable;

public class RepairManDto implements Serializable{
	private static final long serialVersionUID = -6871612705613684546L;
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
