package com.xworkz.app;

public class Ingredent {

	public String name;
	public int  quantity;
	public double cost;

	public  Ingredent(String name, int quantity, double cost) {
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;

	}

	public void printInfo() {
		System.out.println("Name :" + this.name);
		System.out.println("Quantity :" + this.quantity);
		System.out.println("Price :" + this.cost);
	}
}
