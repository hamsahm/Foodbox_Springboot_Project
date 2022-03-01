package com.simplilearn.foodbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.foodbox.services.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/login")
	public boolean validateUser(@RequestParam(required=true) String name,@RequestParam(required=true) String password) {
		
		
		//boolean isValidUser = loginService.validateUser(name, password);
		//return new ResponseEntity(loginService.validateUser(name, password), HttpStatus.OK);
		/*if(categoryName != null) {
			return new ResponseEntity<List<Food>>(foodService.getFoodsByCategory(categoryName), HttpStatus.OK);
		} else {
			
		}
		List<Food> foods =  foodService.getAllFoods();
		
		System.out.println("foods "+foods);
		
		return new ResponseEntity<List<Food>>(foods, HttpStatus.OK);*/
		
		return loginService.validateUser(name, password);
	}
}
