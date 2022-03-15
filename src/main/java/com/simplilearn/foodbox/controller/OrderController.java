package com.simplilearn.foodbox.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.foodbox.entity.Order;
import com.simplilearn.foodbox.services.OrderService;

@RestController
public class OrderController {

	@Autowired
	public OrderService orderService;

	/*
	 * @CrossOrigin(origins = "http://localhost:4200")
	 * 
	 * @GetMapping("/orders/{id}") public ResponseEntity<Optional<Order>>
	 * getAllOrders(@PathVariable Long id) {
	 * 
	 * return new ResponseEntity<Optional<Order>>(orderService.getOrderById(id),
	 * HttpStatus.OK); }
	 */

	/*
	 * @GetMapping("/orders") public ResponseEntity<List<Order>> getAllOrders() {
	 * 
	 * List<Order> orders = orderService.getAllOrders();
	 * 
	 * System.out.println("orders " + orders);
	 * 
	 * return new ResponseEntity<List<Order>>(orders, HttpStatus.OK); }
	 */

	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/orders")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		System.out.println(" inside create order controller >>>"+order);
		return new ResponseEntity<Order>(orderService.createOrder(order), HttpStatus.ACCEPTED);
	}

}
