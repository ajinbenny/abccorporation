package com.cts.training.OrderService.OrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.OrderService.OrderService.model.OrderDetails;


@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
	


}