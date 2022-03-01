package com.simplilearn.foodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.foodbox.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserNameAndPassword(String userName, String password);

}
