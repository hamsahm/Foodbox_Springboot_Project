package com.simplilearn.foodbox.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.foodbox.entity.Category;
import com.simplilearn.foodbox.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

	List<Food> findByCategory(Category category);

}
