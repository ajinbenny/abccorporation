package com.cts.training.SeriesModelService.SeriesModelService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.training.entities.Entities.Models.Model;
@Repository
public interface ModelRepo extends JpaRepository<Model, Long> {
	
	@Query(value="SELECT * FROM model",nativeQuery=true)
	public List<Model> getAll();
	
	@Query(value="SELECT * from model where series_Id=?1",nativeQuery=true)
	public List<Model> getAll(Long id);
	

}
