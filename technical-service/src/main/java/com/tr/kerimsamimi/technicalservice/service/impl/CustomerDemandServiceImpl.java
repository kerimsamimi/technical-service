package com.tr.kerimsamimi.technicalservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tr.kerimsamimi.technicalservice.dao.CustomerDemandDao;
import com.tr.kerimsamimi.technicalservice.mapper.MapperKerim;
import com.tr.kerimsamimi.technicalservice.model.CustomerDemand;
import com.tr.kerimsamimi.technicalservice.model.enums.DiscussionType;
import com.tr.kerimsamimi.technicalservice.service.CustomerDemandService;

@Service
public class CustomerDemandServiceImpl implements CustomerDemandService{
	
	@Autowired
	CustomerDemandDao customerDemandDao;
	
	@Autowired
	private MapperKerim mapperK;
	
	public void addProductMaintananceRequest(DiscussionType discussionType) {
		if(DiscussionType.REFUND.equals(discussionType)) {
			
		}else if(DiscussionType.REPAIR.equals(discussionType)) {
			
		}else {
			
		}
	}
	
	
	public List<CustomerDemand> getCustomerDemands(){
		/* veritabanindan status IN_PROGRESS olan kayitlari cek //DAO
		 * 
		 * 
		 */
		List<CustomerDemand> customerDemandEntityList = null; //DAO - Veri tabanindan gelen kayitlar.
		return mapperK.convertDemandFromEntity(customerDemandEntityList);
	}


	@Override
	public List<CustomerDemand> getUpToDateIssues() {
		/*
		 * CustomerDemand 
		 * Customer demands tablosundan maintananceDate  = bugun (new Date) olan kayitlari getir. 
		 */
		return null;
	}


	@Override
	public void repair(Integer customerDemandId) {
		/*
		 * DAO da yap
		 * Veri tabanina git, status u inprogress den completed a cek.
		 * UPDATE customer_demand SET status = 'COMPLETED' WHERE id = customerDemandId;
		 */
	}
}
