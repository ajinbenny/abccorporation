package com.cts.training.SeriesModelService.SeriesModelService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.training.entities.Entities.Models.Series;


@Repository
public interface SeriesRepo extends JpaRepository<Series, Long> {
	
	@Query(value="SELECT * FROM series",nativeQuery=true) 
	public List<Series> getAll();

}
