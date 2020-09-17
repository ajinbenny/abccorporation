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
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="color")
public class Color {
	
	@Id
	@Column(name="color_id")
	private long colorId;
	
	@Column(name="color_name")
	private String colorName;
	
	@Column(name="color_price")
	private long colorPrice;
	
	@Column(name="color_qty")
	private long colorQty;
	

}
