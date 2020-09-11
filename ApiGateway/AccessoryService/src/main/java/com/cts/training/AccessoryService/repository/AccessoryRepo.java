package com.cts.training.AccessoryService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.training.entities.Entities.Models.Accessory;

@Repository
public interface AccessoryRepo extends JpaRepository<Accessory, Long> {
	
		@Query(value = "SELECT * FROM accessory WHERE accessory_id IN (SELECT accessory_id FROM modelaccessory WHERE model_id = ?1)",nativeQuery = true)
		public List<Accessory> getAll(long id);
	
	}
	
	
	
//	@Query(value = " select  * from accessory where accessory_id "
// 		+" IN (select accessory_id from modelaccessory where model_id = ?1)", nativeQuery=true)
//	
//	public List<Accessory> getAll(long id);
//
		

