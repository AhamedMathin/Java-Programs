package com.xworkz.app.method.overload.override;

public class Theater {
	public String name;
	public String location;
	public double price;
	public int rating;
	public int pinCode;

	public void watch() {
		System.out.println("invoking  watch in Theater");
	}

	public void watch(String name) {
		System.out.println("invoking String watch in Theater");
		
	}

	public void watch(String name, String location) {
		System.out.println("invoking String,String watch in Theater");
	
	}

	public void watch(String name, String location, double price) {
		System.out.println("invoking String,String,double watch in Theater");
	
	}

	public void watch(String name, String location, double price,int rating) {
		System.out.println("invoking String,String,double,int watch in Theater");
	
	}

	public void watch(String name, String location, double price,int rating, int pinCode) {
		System.out.println("invoking String,String,double,int,int watch in Theater");
		
	}
}
