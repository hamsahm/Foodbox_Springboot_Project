package com.simplilearn.foodbox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.foodbox.entity.User;
import com.simplilearn.foodbox.repository.UserRepository;


@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;

	public boolean validateUser(String userName, String password) {

		System.out.println("userName " + userName);
		System.out.println("password " + password);
		User user = userRepository.findByUserNameAndPassword(userName, password);

		if (user != null) {
			return true;
		}
		return false;
	}

}
