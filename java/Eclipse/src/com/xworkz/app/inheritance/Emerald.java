package com.xworkz.app.inheritance;

public class Emerald extends Diamond {
	public Emerald(String brand,String type,double grams,double price) 
		
		{
		    super(brand,type,grams,price);
	    	 System.out.println("invoking const in Emerald");
		}

	public Emerald()
		{
			 super("Bort","pure",2.0,2400000);
	    	 System.out.println("invoking no-arg const in Emerald");
		}
}
