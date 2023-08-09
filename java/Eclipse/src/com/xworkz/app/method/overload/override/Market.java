package com.xworkz.app.method.overload.override;

public class Market {
	public String name;
	public String location;
	public double price;
	public String type;
	public int pinCode;

	public void buy() {
		System.out.println("invoking buy in Market");
	}

	public void buy(String name) {
		System.out.println("invoking String buy in Market");
		
	}

	public void buy(String name, String location) {
		System.out.println("invoking String,String buy in Market");
	
	}

	public void buystay(String name, String location, double price) {
		System.out.println("invoking String,String,double buy in Market");
	
	}

	public void buy(String name, String location, double price, String type) {
		System.out.println("invoking String,String,double,String buy in Market");
	
	}

	public void buy(String name, String location, double price, String type, int pinCode) {
		System.out.println("invoking String,String,double,String,int buy in Market");
		
	}

}
