package com.xworkz.app.method.overload.override;

public class Zoo {
	public String name;
	public String location;
	public double price;
	public String State;
	public int pinCode;

	public void click() {
		System.out.println("invoking click in Zoo");
	}

	public void click(String name) {
		System.out.println("invoking String click in Zoo");

	}

	public void click(String name, String location) {
		System.out.println("invoking String,String click in Zoo");

	}

	public void click(String name, String location, double price) {
		System.out.println("invoking String,String,double click in Zoo");

	}

	public void click(String name, String location, double price, String state) {
		System.out.println("invoking String,String,double,String click in Zoo");

	}

	public void click(String name, String location, double price, String state, int pinCode) {
		System.out.println("invoking String,String,double,String,int click in Zoo");

	}

}
