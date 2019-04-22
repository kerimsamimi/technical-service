package com.tr.kerimsamimi.technicalservice.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tr.kerimsamimi.technicalservice.dao.ProductDao;
import com.tr.kerimsamimi.technicalservice.model.CustomerDemand;
import com.tr.kerimsamimi.technicalservice.model.Product;
import com.tr.kerimsamimi.technicalservice.model.ProductDto;

@Component
public class MapperKerim {

	public List<CustomerDemand> convertDemandFromEntity(List<CustomerDemand> customerDemandEntityList){
		List<CustomerDemand> customerDemandList = new ArrayList<>();
		
		for(CustomerDemand item : customerDemandEntityList) {
			CustomerDemand dto = new CustomerDemand();
			dto.setChangedPart(item.getChangedPart());
			dto.setDisType(item.getDisType());
			dto.setMaintananceDate(item.getMaintananceDate());
			dto.setProduct(item.getProduct());
			dto.setStatus(item.getStatus());
			customerDemandList.add(dto);
		}
		return customerDemandList;
	}
	
	public Product convertProductFromDTO(ProductDto productDTO) {
		
		Product product=new Product();
		product.setNo(productDTO.getNo());
		product.setCustomer(productDTO.getCustomer());
		product.setProductTitle(productDTO.getProductTitle());
		product.setSerialNo(productDTO.getSerialNo());
		
		return product;
		
	}
	
}
