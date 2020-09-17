package com.cts.training.SeriesModelService.SeriesModelService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.SeriesModelService.SeriesModelService.repository.ModelRepo;
import com.cts.training.SeriesModelService.SeriesModelService.repository.SeriesRepo;
import com.cts.training.entities.Entities.Models.*;
@Service
public class SeriesModelService {

	@Autowired
	private SeriesRepo seriesRepo;
	@Autowired
	private ModelRepo modelRepo;
	
	
	
  	public List<Series> getSeries(){

			return this.seriesRepo.getAll();
//		
		}
	public List<Model> getModels(){
		return this.modelRepo.getAll();
	}
	
	public List<Model> getAllModelSeries(long id){
		return this.modelRepo.getAll();
	}
	
	public List<Model> getById(long id){
		return this.modelRepo.getAll(id);
	}
}