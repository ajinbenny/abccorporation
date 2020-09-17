package com.cts.training.entities.Entities.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="model")
public class Model {
	
	@Id
	@Column(name="model_id")
	private long modelId;
	
	@Column(name="model_name")
	private String modelName;
	
	@Column(name="model_price") 
	private long modelPrice;
	
	
	@Column(name="series_id")
    private long seriesId;


	}
