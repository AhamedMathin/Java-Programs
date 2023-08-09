package com.xworkz.app.method.overload.override;

public class Pub {
	public String name;
	public String location;
	public double price;
	public String State;
	public int pinCode;

	public void drink() {
		System.out.println("invoking drink in Pub");
	}

	public void drink(String name) {
		System.out.println("invoking String drink in Pub");

	}

	public void drink(String name, String location) {
		System.out.println("invoking String,String drink in Pub");

	}

	public void drink(String name, String location, double price) {
		System.out.println("invoking String,String,double drink in Pub");

	}

	public void drink(String name, String location, double price, String state) {
		System.out.println("invoking String,String,double,String drink in Pub");

	}

	public void drink(String name, String location, double price, String state, int pinCode) {
		System.out.println("invoking String,String,double,String,int drink in Pub");

	}

}
