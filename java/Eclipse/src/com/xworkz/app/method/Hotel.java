package com.xworkz.app.method;

public class Hotel {
	public String foodType;
	public double price;

	public void eat() {
		System.out.println("invoking no-arg method eat in Hotel ");
		eat(100);
		eat("ordinary meal");
	}

	public void eat(String foodType) {
		System.out.println("invoking String eat in Hotel ");
		System.out.println("FoodType:" + foodType);
	}

	public void eat(double price) {
		System.out.println("invoking double eat in Hotel ");
		System.out.println("Cost:" + price);
	}

	public void eat(String foodType, double price) {
		System.out.println("invoking String,double eat in Hotel ");
		eat(foodType);
		eat(price);
	}

}
