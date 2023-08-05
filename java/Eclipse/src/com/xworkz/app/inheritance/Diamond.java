package com.xworkz.app.inheritance;

public class Diamond {
	public String brand;
	public  String type;
	public double grams;
	public double price;
	public Diamond()
	{
		 this("Natural Diamond","pure",1.0,2000000);
			System.out.println("Invoking no-arg const in Diamond");

	}
	public Diamond(String brand,String type,double grams,double price)
	{
		System.out.println("Invoking String,String,double,double  in Diamond");
		this.brand=brand;
		this.type=type;
		this.grams=grams;
		this.price=price;	
	}

}
