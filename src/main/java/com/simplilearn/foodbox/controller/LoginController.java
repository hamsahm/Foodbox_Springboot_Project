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
	public boolean validateUser(@RequestParam(required = true) String name,
			@RequestParam(required = true) String password) {

		return loginService.validateUser(name, password);
	}
}
