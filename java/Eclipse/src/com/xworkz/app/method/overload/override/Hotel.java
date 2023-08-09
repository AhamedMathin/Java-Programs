package com.xworkz.app.method.overload.override;

public class Hotel {
	public String name;
	public String location;
	public double price;
	public String type;
	public int pinCode;

	public void stay() {
		System.out.println("invoking stay in Hotel");
	}

	public void stay(String name) {
		System.out.println("invoking String stay in Hotel");
		
	}

	public void stay(String name, String location) {
		System.out.println("invoking String,String stay in Hotel");
	
	}

	public void stay(String name, String location, double price) {
		System.out.println("invoking String,String,double stay in Hotel");
	
	}

	public void stay(String name, String location, double price, String type) {
		System.out.println("invoking String,String,double,String stay in Hotel");
	
	}

	public void stay(String name, String location, double price, String type, int pinCode) {
		System.out.println("invoking String,String,double,String,int stay in Hotel");
		
	}
}
