
package com.simplilearn.foodbox.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.foodbox.entity.Order;
import com.simplilearn.foodbox.repository.FoodRepository;
import com.simplilearn.foodbox.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	public OrderRepository orderRepository;

	@Autowired
	public FoodRepository foodRepository;

	@Transactional
	public Order createOrder(Order order) {

		Order insertedOrder = orderRepository.save(order);
		return insertedOrder;
	}
}
