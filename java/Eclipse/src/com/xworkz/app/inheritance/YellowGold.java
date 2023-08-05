package com.xworkz.app.inheritance;

public class YellowGold extends Gold {

    public YellowGold(String brand,String type,double grams,double price) 
	
	{
		 super(brand,type,grams,price);
    	 System.out.println("invoking const in YellowGold");
	}

	public YellowGold()
	{
		 super("Malabar","pure",6,24000);
    	 System.out.println("invoking no-arg const in YellowGold");
	}

}
