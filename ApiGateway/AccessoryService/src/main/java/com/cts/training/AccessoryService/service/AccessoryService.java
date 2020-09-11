package com.cts.training.AccessoryService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.AccessoryService.repository.AccessoryRepo;
import com.cts.training.entities.Entities.Models.Accessory;


@Service
public class AccessoryService {

	 @Autowired
	 private AccessoryRepo accessoryRepo;

	  		public List<Accessory> getById(long id)
	  		{
	  			return this.accessoryRepo.getAll(id);
	  			}

	 		public List<Accessory> getAll() {
	 			// TODO Auto-generated method stub
	 			return this.accessoryRepo.findAll();
	 		}
	
	
	
	
	
	
//	@Autowired
//	private AccessoryRepo accessoryRepo;
//	
//	public List<Accessory> getById(long id) {
//		return this.accessoryRepo.getAll(id);
//		//return accessoryRepo.getAll(id);
//		
//}
//	public List<Accessory> getAll() {
//		return this.accessoryRepo.findAll();
//		//return accessoryRepo.findAll();
//	}

}
