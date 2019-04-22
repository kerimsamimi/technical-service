package com.tr.kerimsamimi.technicalservice.service;

import java.util.List;
import java.util.Optional;

import com.tr.kerimsamimi.technicalservice.model.CustomerDemand;
import com.tr.kerimsamimi.technicalservice.model.Product;

public interface ProductService {
	
	public void notifyWhenDateUp();
	
	public Optional<Product> getProductById(Integer customerId);
	
	public void addProduct(Product product);
	
	public void addCustomerDemand(CustomerDemand customerDemand);

	public List<Product> getAllProducts(Integer custId);

}
