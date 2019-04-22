package com.tr.kerimsamimi.technicalservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tr.kerimsamimi.technicalservice.model.CustomerDemandDto;
import com.tr.kerimsamimi.technicalservice.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService{
	
	public void assignTask(Integer workerId, Integer customerDemandId){
		/*
		 * Bu islem 2 adimdan olusacak
		 * 1) Once git veritabanindan workerId ve customerDemandId 'li kayit var mi kontrol et. Varsa yeni atama yapma.
		 *
		 * 2) Eger yoksa, bu atama islemini gerceklestir. Yani Task tablosuna kayit at. 
		 * SELECT * FROM task WHERE worker_id = workerId and customer_demand_id = customerDemandID
		 * 	
		 * 
		 * TASK tablosu 
		 * id / worker_id / customer_demand_id
		 * 
		 */
	}

	@Override
	public List<CustomerDemandDto> getAssignedIssues(Integer workerId) {
		/*
		 * Once task tablosuna git ve isciye ait musteri taleplerini(customer_demand_id) cek.
		 * Ornek
		 * QUERY -> SELECT * FROM task WHERE worker_id = 101
		 * RESULT 
		 * 	  id / worker_id / customer_demand_id
		 * 	  1123    101         201
		 *    2321    101         205
		 *    2133    101         416
		 *    
		 * Gelen uc kayittaki customer_demand_id ler customer_demand tablosu ile eslesip oradaki musteri taleplerini cekip, ekrana getirecekler.
		 * 
		 * Ornek
		 * Yukarida gelen 201, 2015 ve 416 nolu kayitlari cek
		 * 
		 * QUERY - > SELECT * FROM customer_demand WHERE id in(201, 205, 416);
		 *Sonucu ekrana don.
		 */
		return null;
	}

}
