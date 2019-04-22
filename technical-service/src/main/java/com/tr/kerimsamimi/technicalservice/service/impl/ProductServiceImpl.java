package com.tr.kerimsamimi.technicalservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tr.kerimsamimi.technicalservice.dao.CustomerDemandDao;
import com.tr.kerimsamimi.technicalservice.dao.ProductDao;
import com.tr.kerimsamimi.technicalservice.model.CustomerDemand;
import com.tr.kerimsamimi.technicalservice.model.CustomerDemandDto;
import com.tr.kerimsamimi.technicalservice.model.Product;
import com.tr.kerimsamimi.technicalservice.model.ProductDto;
import com.tr.kerimsamimi.technicalservice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	CustomerDemandDao customerDemandDao;

	@Override
	public void notifyWhenDateUp() {
		
	}

	@Override
	public Optional<Product> getProductById(Integer productId) {
		return productDao.findById(productId);
		
	}

	@Override
	public void addProduct(Product product) {
		productDao.save(product);
		
	}

	@Override
	public void addCustomerDemand(CustomerDemand customerDemand) {
		customerDemandDao.save(customerDemand);
	}

	@Override
	public List<Product> getAllProducts(Integer custId) {
		
		return productDao.findAllByCustomerId(custId);
	}

	

}
