package com.xworkz.app.inheritance;

public class BlackCoffee  extends Coffee{
     public BlackCoffee(String brand,boolean taste,int quality,double price) {
    	 super(brand,taste,quality,price);
    	 System.out.println("invoking const in BlackCoffee");
     }

     public BlackCoffee() {
    	 super("ColdCoffee",true,100,250);
    	 System.out.println("invoking no-arg const in BlackCoffee");
    	 
     }
}
