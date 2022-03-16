package com.simplilearn.foodbox.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.foodbox.entity.Category;
import com.simplilearn.foodbox.entity.Food;
import com.simplilearn.foodbox.repository.FoodRepository;

@Service
public class FoodService {

	@Autowired
	public FoodRepository foodRepository;

	@Autowired
	public CategoryService categoryService;

	public List<Food> getAllFoods() {
		return foodRepository.findAll();
	}

	public Optional<Food> getFoodDetails(Long id) {
		return foodRepository.findById(id);
	}

	public List<Food> getFoodsByCategory(String categoryName) {
		Category category = categoryService.getCategoryByName(categoryName);
		System.out.println("category inside food service >>>>>" + category.toString());

		System.out.println("category Id" + category.getCategoryId());
		return foodRepository.findByCategory(category);
	}

	//@Transactional
	public Food createFood(Food food) {
		Food insertedFood = foodRepository.save(food);
		return insertedFood;
	}
}
