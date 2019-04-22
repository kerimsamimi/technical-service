package com.tr.kerimsamimi.technicalservice.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.tr.kerimsamimi.technicalservice.model.Product;


public interface ProductDao extends CrudRepository<Product, Integer>  {

	@Query("FROM Product Where customer.customerNo=?1")
	List<Product> findAllByCustomerId(Integer custId);
	
	/*public void createProduct(Product product);
	public List<Product> ListAllProduct();
	public Product ListProductByNo(Integer no);
	public void updateProduct(Product product);
	public void deleteProductByNo(Product product);*/
	 
}
