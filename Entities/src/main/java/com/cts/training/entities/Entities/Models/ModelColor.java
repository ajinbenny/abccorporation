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
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="modelcolor")
public class ModelColor {

	@Id
	@Column(name="modelcolor_id")
	private long modelColorId;
	
	
	@Column(name="model_id")
	private long modelId;
	
	
	@Column(name="color_id")
	private long colorId;
}
