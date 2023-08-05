package com.xworkz.app.inheritance;

public class Gold {
	public String brand;
	public String type;
	public double grams;
	public double price;
	public Gold()
	{
		 this("Manapuram Gold","pure",5.0,20000);
			System.out.println("Invoking no-arg const in Gold");

	}
	public Gold(String brand,String type,double grams,double price)
	{
		System.out.println("Invoking String,String,double,double  in Gold");
		this.brand=brand;
		this.type=type;
		this.grams=grams;
		this.price=price;	
	}
}
