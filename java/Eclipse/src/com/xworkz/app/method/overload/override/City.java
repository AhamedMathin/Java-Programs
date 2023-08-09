package com.xworkz.app.method.overload.override;

public class City {
	public String name;
	public String location;
	public double price;
	public String State;
	public int pinCode;

	public void travel() {
		System.out.println("invoking travel in City");
	}

	public void travel(String name) {
		System.out.println("invoking String travel in City");

	}

	public void travel(String name, String location) {
		System.out.println("invoking String,String travel in City");

	}

	public void travel(String name, String location, double price) {
		System.out.println("invoking String,String,double travel in City");

	}

	public void travel(String name, String location, double price, String state) {
		System.out.println("invoking String,String,double,String travel in City");

	}

	public void travel(String name, String location, double price, String state, int pinCode) {
		System.out.println("invoking String,String,double,String,int travel in City");

	}
}
