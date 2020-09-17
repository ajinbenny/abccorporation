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
@NoArgsConstructor
@ToString
@Table(name="accessory")
public class Accessory {

	@Id
	@Column(name="accessory_id")
	private long accessoryId;
	
	@Column(name="accessory_name")
	private String accessoryName;
	
	@Column(name="accessory_price")
	private long accessoryPrice;
	
}
