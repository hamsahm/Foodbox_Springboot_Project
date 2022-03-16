package com.simplilearn.foodbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.foodbox.entity.Order;
import com.simplilearn.foodbox.services.OrderService;

@RestController
public class OrderController {

	@Autowired
	public OrderService orderService;

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/orders")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.createOrder(order), HttpStatus.ACCEPTED);
	}

}
