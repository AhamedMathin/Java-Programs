package com.xworkz.app.inheritance;

public class Mushroom {
	
	public String name; 
	public String type;
	public double price;
	public boolean edible;
	
	
	public Mushroom(String name,String type,double price,boolean edible) {
		this(name,type,price);
	//this.name=name;
	//this.type=type;
	//this.price=price;
	this.edible=edible;
	System.out.println("invoking parameter const in Mushroom");
	}
	public Mushroom(String name,String type,double price) {
		//this(name,type);
		this.name=name;
		this.type=type;
		this.price=price;
		System.out.println("invoking String,String,double const in Mushroom");
	}

}
