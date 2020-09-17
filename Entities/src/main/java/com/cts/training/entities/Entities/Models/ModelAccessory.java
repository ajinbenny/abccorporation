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
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Table(name="modelaccessory")
public class ModelAccessory {

	@Id
	@Column(name="modelaccessory_id")
	private long modelAccessoriess_id;
	
	
	@Column(name="model_id")
	private long modelId;
	
	
	@Column(name="accessory_id")
	private long accessoryId;
	
	
}
