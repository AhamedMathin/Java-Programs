package com.xworkz.app.method.overload.override;

public class Hostel {
	public String name;
	public String location;
	public double price;
	public int rating;
	public int pinCode;

	public void leave() {
		System.out.println("invoking  leave in Hostel");
	}

	public void leave(String name) {
		System.out.println("invoking String leave in Hostel");
		
	}

	public void leave(String name, String location) {
		System.out.println("invoking String,String leave in Hostel");
	
	}

	public void leave(String name, String location, double price) {
		System.out.println("invoking String,String,double leave in Hostel");
	
	}

	public void leave(String name, String location, double price,int rating) {
		System.out.println("invoking String,String,double,int leave in Hostel");
	
	}

	public void leave(String name, String location, double price,int rating, int pinCode) {
		System.out.println("invoking String,String,double,int,int leave in Hostel");
		
	}
}
