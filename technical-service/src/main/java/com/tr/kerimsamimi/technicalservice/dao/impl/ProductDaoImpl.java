/*package com.tr.kerimsamimi.technicalservice.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tr.kerimsamimi.technicalservice.dao.ProductDao;
import com.tr.kerimsamimi.technicalservice.model.Product;

//@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void createProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> ListAllProduct() {
		return (List<Product>) sessionFactory.getCurrentSession().createQuery("FROM Product");
	}

	@Override
	public Product ListProductByNo(Integer no) {
		return sessionFactory.getCurrentSession().get(Product.class, no);
	}

	@Override
	public void updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);

	}

	@Override
	public void deleteProductByNo(Product product) {
		sessionFactory.getCurrentSession().delete(product);		
	}
	
}*/
