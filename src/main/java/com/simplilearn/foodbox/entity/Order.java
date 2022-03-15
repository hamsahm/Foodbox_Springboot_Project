package com.simplilearn.foodbox.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "orders")
public class Order {

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + ", orderAmount=" + orderAmount + "]";
	}

	/*
	 * public Long getUserId() { return userId; }
	 * 
	 * public void setUserId(Long userId) { this.userId = userId; }
	 */
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;

	/*
	 * // @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 * 
	 * @Column(name = "user_id", nullable = false) // @JoinColumn(name = "user_id",
	 * referencedColumnName = "user_id") private Long userId;
	 */

	@Column(name = "order_amount")
	private double orderAmount;

	/*
	 * @OneToMany(cascade = CascadeType.REFRESH)
	 * 
	 * @JoinTable(name = "orders_foods", joinColumns = {
	 * 
	 * @JoinColumn(name = "order_id", nullable = false, updatable = false) },
	 * inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "food_id", nullable = false, updatable = false) })
	 */
	// @ElementCollection(targetClass = Food.class)

	/*
	 * @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "orders_foods", joinColumns = @JoinColumn(name =
	 * "order_id"), inverseJoinColumns = @JoinColumn(name = "food_id"))
	 */
	
	
	@ManyToMany
	private List<Food> foods;

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

}
