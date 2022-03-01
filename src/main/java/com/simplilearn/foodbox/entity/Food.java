package com.simplilearn.foodbox.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "food")
public class Food {
	
	@Id
	@Column(name="food_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long foodId;

	public long getFoodId() {
		return foodId;
	}

	public void setFoodId(long foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	@Column(name="food_name")
	private String foodName;
	
	@Column(name="price")
	private double price;
	
	@Column(name="image_url")
	private String imageUrl;

	@ManyToOne
    @JoinColumn(name = "category", referencedColumnName = "category_id")
	private Category category;
	
	@Column(name="description")
	private String description;
	
	@Column(name="offers")
	private String offers;

}
