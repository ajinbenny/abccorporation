package com.cts.training.ColorService.ColorService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.ColorService.ColorService.service.ColorService;
import com.cts.training.entities.Entities.Models.Color;

@RestController
@RequestMapping("/color")
public class ColorController {
	
	@Autowired
	private ColorService colorservice;
	
	@GetMapping("/All")
	public List<Color> getColors() {
		return colorservice.getAll();
	}

	@GetMapping("/getcolors/{id}")
	public List<Color> getColors(@PathVariable("id") long id) {
		List<Color> list=new ArrayList<Color>();
		list=this.colorservice.getById(id);
		return list;
		
	}
}
