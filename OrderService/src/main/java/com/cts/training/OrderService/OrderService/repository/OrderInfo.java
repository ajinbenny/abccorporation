package com.cts.training.OrderService.OrderService.repository;

import org.springframework.stereotype.Repository;

import com.cts.training.OrderService.OrderService.model.OrderColorAccessory;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface OrderInfo extends JpaRepository<OrderColorAccessory, Long> {


}
