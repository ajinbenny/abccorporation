package com.cts.training.OrderService.OrderService.DTO;


import java.util.List;

import com.cts.training.OrderService.OrderService.model.OrderColorAccessory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SaveOrderDTO {
	
	private long modelId;
	private long seriesId;
	private long price;
	private List<OrderColorAccessory> ordercoloraccessories;

}
