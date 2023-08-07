package com.xworkz.app.method;

public class Umberlla {
	public String materialType;
	public double price;

	public void protect() {
		System.out.println("invoking no-arg method protect in Umberlla ");
		protect("nylon");
		protect(450);
	}

	public void protect(String materialType) {
		System.out.println("invoking String protect in Umberlla ");
		System.out.println("MaterialType:" + materialType);
	}

	public void protect(double price) {
		System.out.println("invoking double protect in Umberlla ");
		System.out.println("Cost:" + price);
	}

	public void protect(String materialType, double price) {
		System.out.println("invoking String,double protect in Umberlla ");
		protect(materialType);
		protect(price);
	}
}
