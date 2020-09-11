package com.cts.training.ColorService.ColorService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.ColorService.ColorService.repository.ColorRepo;
import com.cts.training.entities.Entities.Models.Color;

@Service
public class ColorService {

	@Autowired
	private ColorRepo colorRepo;
	
	public List<Color> getAll () {
		return this.colorRepo.findAll();
	
	}
	

	public List<Color> getById(long id){
		return this.colorRepo.getAll(id);
	}
	
	
}
