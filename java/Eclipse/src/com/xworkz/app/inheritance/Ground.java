package com.xworkz.app.inheritance;

public class Ground {
public String name;
public String location;
public int acquriments;
public boolean parking;

public Ground()
{
	 this("Pavillion","Banglore",100000,true);
		System.out.println("Invoking no-arg const in Ground");

}
public Ground(String name,String location, int acquriments,boolean parking)
{
	System.out.println("Invoking String,String,int,boolean  in Ground");
	this.name=name;
	this.location=location;
	this.acquriments=acquriments;
	this.parking=parking;
}
}
