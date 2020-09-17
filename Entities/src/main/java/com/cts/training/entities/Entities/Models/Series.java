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
@AllArgsConstructor
@NoArgsConstructor
@Table(name="series")
public class Series {
	
	@Id
	@Column(name="series_id")
	private long seriesId;
	
	@Column(name="series_name")
	private String seriesName;
	
	
	

}
