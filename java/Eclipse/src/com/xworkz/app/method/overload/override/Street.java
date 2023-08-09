package com.xworkz.app.method.overload.override;

public class Street {
	public String name;
	public String location;
	public double price;
	public String State;
	public int pinCode;

	public void walk() {
		System.out.println("invoking  walk in Street");
	}

	public void walk(String name) {
		System.out.println("invoking String walk in Street");

	}

	public void walk(String name, String location) {
		System.out.println("invoking String,String walk in Street");

	}

	public void walk(String name, String location, double price) {
		System.out.println("invoking String,String,double walk in Street");

	}

	public void walk(String name, String location, double price, String state) {
		System.out.println("invoking String,String,double,String walk in Street");

	}

	public void walk(String name, String location, double price, String state, int pinCode) {
		System.out.println("invoking String,String,double,String,int walk in Street");

	}
}
