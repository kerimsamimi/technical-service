package com.tr.kerimsamimi.technicalservice.request;

import java.util.Date;

import com.tr.kerimsamimi.technicalservice.model.Product;
import com.tr.kerimsamimi.technicalservice.model.ProductDto;
import com.tr.kerimsamimi.technicalservice.model.enums.DiscussionType;

public class AddProductMaintananceRequest extends BaseRequest{
	
	private static final long serialVersionUID = -7534279478304018321L;
	/*
	 *  customerId, productId, maintananceDate, disType, changedPart, status //CustomerDemands gelen requesti customerDemand tablosuna at
	 *  Status ilk etapta in_progress olacak.
	 *  tamir edildiginde status done olarak update edilecek.
	 */
	private Integer customerId;
	private DiscussionType discussionType;
	private ProductDto product;
	private Date maintananceDate;
	private String changedPart;

	public Date getMaintananceDate() {
		return maintananceDate;
	}
	public void setMaintananceDate(Date maintananceDate) {
		this.maintananceDate = maintananceDate;
	}
	public String getChangedPart() {
		return changedPart;
	}
	public void setChangedPart(String changedPart) {
		this.changedPart = changedPart;
	}
	public DiscussionType getDiscussionType() {
		return discussionType;
	}
	public void setDiscussionType(DiscussionType discussionType) {
		this.discussionType = discussionType;
	}
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public ProductDto getProduct() {
		return product;
	}
	public void setProduct(ProductDto product) {
		this.product = product;
	}
	
	
	
}
