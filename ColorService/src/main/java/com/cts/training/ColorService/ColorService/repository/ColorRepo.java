package com.cts.training.ColorService.ColorService.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.training.entities.Entities.Models.Color;

@Repository

	public interface ColorRepo extends JpaRepository<Color, Long> {
		
//	@Query(value="SELECT * FROM color",nativeQuery=true)
//	public List<Model> getAll();
	
		@Query(value="SELECT * FROM color where color_id" 
				+" IN (select color_id from modelcolor where model_id=?1)",nativeQuery=true)
		public List<Color> getAll(long id);
		
		
}
