package com.xworkz.app.method.overload.override;

public class Bakery {
	public String name;
	public String location;
	public double price;
	public boolean sweet;
	public int pinCode;

	public void taste() {
		System.out.println("invoking taste in Bakery");
	}

	public void taste(String name) {
		System.out.println("invoking String taste in Bakery");
		System.out.println("Name:" + name);
	}

	public void taste(String name, String location) {
		System.out.println("invoking String,String taste in Bakery");
		System.out.println("Name:" + name);
		System.out.println("Location:" + location);
	}

	public void taste(String name, String location, double price) {
		System.out.println("invoking String,String,double taste in Bakery");
		System.out.println("Name:" + name);
		System.out.println("Location:" + location);
		System.out.println("Price:" + price);
	}

	public void taste(String name, String location, double price, boolean sweet) {
		System.out.println("invoking String,String,double taste in Bakery");
		System.out.println("Name:" + name);
		System.out.println("Location:" + location);
		System.out.println("Price:" + price);
		System.out.println("Sweetness:" + sweet);
	}

	public void taste(String name, String location, double price, boolean sweet, int pinCode) {
		System.out.println("invoking String,String,double taste in Bakery");
		System.out.println("Name:" + name);
		System.out.println("Location:" + location);
		System.out.println("Price:" + price);
		System.out.println("Sweetness:" + sweet);
		System.out.println("Pincode:" + pinCode);
	}

}
