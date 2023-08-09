package com.xworkz.app.method.overload.override;

public class Mall {
	public String name;
	public String location;
	public double price;
	public int rating;
	public int pinCode;

	public void see() {
		System.out.println("invoking  see in Mall");
	}

	public void see(String name) {
		System.out.println("invoking String see in Mall");
		
	}

	public void see(String name, String location) {
		System.out.println("invoking String,String see in Mall");
	
	}

	public void see(String name, String location, double price) {
		System.out.println("invoking String,String,double see in Mall");
	
	}

	public void see(String name, String location, double price,int rating) {
		System.out.println("invoking String,String,double,int see in Mall");
	
	}

	public void see(String name, String location, double price,int rating, int pinCode) {
		System.out.println("invoking String,String,double,int,int see in Mall");
		
	}
}
