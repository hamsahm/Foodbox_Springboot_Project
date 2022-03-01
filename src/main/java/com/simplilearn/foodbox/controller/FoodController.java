package com.simplilearn.foodbox.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.foodbox.entity.Food;
import com.simplilearn.foodbox.services.FoodService;

@RestController
public class FoodController {
	
	@Autowired
	public FoodService foodService;
	/*
	 * @GetMapping("/foods") public List<Food> getAllCategories() { List<Food> foods
	 * = new ArrayList<Food>(); foods = foodService.getAllFoods();
	 * System.out.println(" foods inside controller "+foods); return foods; }
	 */

	@GetMapping("/foods/{id}")
	public ResponseEntity<Optional<Food>> getFoodDetails(@PathVariable Long id) {
		
		return new ResponseEntity<Optional<Food>>(foodService.getFoodDetails(id), HttpStatus.OK);
	}
	
	@GetMapping("/foods")
	public ResponseEntity<List<Food>> getFoodsByCategory(@RequestParam(required=false) String categoryName ) {
		
		if(categoryName != null) {
			return new ResponseEntity<List<Food>>(foodService.getFoodsByCategory(categoryName), HttpStatus.OK);
		} else {
			
		}
		List<Food> foods =  foodService.getAllFoods();
		
		System.out.println("foods "+foods);
		
		return new ResponseEntity<List<Food>>(foods, HttpStatus.OK);
	}
	

    @PostMapping("/foods")
    public ResponseEntity<Food> createMovie(@RequestBody Food food) {
        return new ResponseEntity<Food>(foodService.createFood(food), HttpStatus.ACCEPTED);
    }

}
