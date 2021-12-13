package com.hotel.model;

public class Order {
	
	private String order_id;
	private Payment payment;
	private User user;
	private FoodItems foodItems;
	
	public Order(String order_id, Payment payment, User user, FoodItems foodItems) {
		super();
		this.order_id = order_id;
		this.payment = payment;
		this.user = user;
		this.foodItems = foodItems;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public FoodItems getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(FoodItems foodItems) {
		this.foodItems = foodItems;
	}
	
}
