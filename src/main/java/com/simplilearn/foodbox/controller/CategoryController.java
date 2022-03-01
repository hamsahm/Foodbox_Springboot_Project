package com.simplilearn.foodbox.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.foodbox.entity.Category;
import com.simplilearn.foodbox.services.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	public CategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Category> getAllCategories() {
		List<Category> categories = new ArrayList<Category>();
		categories = categoryService.getAllCategories();
		System.out.println(" Categories inside controller "+categories);
		return categories;
	}


}
