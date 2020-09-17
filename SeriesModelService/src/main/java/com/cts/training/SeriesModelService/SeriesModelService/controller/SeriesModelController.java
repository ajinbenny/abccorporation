package com.cts.training.SeriesModelService.SeriesModelService.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.SeriesModelService.SeriesModelService.service.SeriesModelService;
import com.cts.training.entities.Entities.Models.*;
import io.swagger.annotations.Api;

@Api
@RestController
@CrossOrigin("http://localhost:4200")
public class SeriesModelController {

	@Autowired
	private SeriesModelService seriesmodelservice;
	
	
	@GetMapping("/series")
	public List<Series> getSeries(){
		
		return seriesmodelservice.getSeries();
		
	}
	
	@GetMapping("/models")
	public List<Model> getModels(){
		return seriesmodelservice.getModels();
		
	}
	@GetMapping("/getmodels/{id}")
	public List<Model> getModels(@PathVariable("id") long id) {
		List<Model> list=new ArrayList<Model>();
		list=this.seriesmodelservice.getById(id);
		return list;
		
	}
	
	

}
	


