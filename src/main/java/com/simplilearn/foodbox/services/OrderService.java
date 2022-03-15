
package com.simplilearn.foodbox.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.foodbox.entity.Food;
import com.simplilearn.foodbox.entity.Order;
import com.simplilearn.foodbox.repository.FoodRepository;
import com.simplilearn.foodbox.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	public OrderRepository orderRepository;
	
	@Autowired
	public FoodRepository foodRepository;

	//@Autowired
	//private OrderFoodsService orderFoodsService;

	@Transactional
	public Order createOrder(Order order) {

		//List<Food> foods = order.getFoods();
		
		
		
		//System.out.println(" inserted Order " + insertedOrder);
		
		/*
		 * List<Food> managedFoods = new ArrayList<Food>();
		 * 
		 * for(Food food: order.getFoods()) {
		 * managedFoods.add(foodRepository.getById(food.getFoodId())); }
		 * 
		 * order.setFoods(managedFoods);
		 */
		/*
		 * if (insertedOrder != null) { for (Food food : foods) {
		 * orderFoodsService.createOrderFood(new OrderFoods(insertedOrder.getOrderId(),
		 * food.getFoodId())); }
		 * 
		 * }
		 */
		
		Order insertedOrder = orderRepository.save(order);
		return insertedOrder;
	}
}
