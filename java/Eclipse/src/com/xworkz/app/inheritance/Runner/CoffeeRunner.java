package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.BlackCoffee;
import com.xworkz.app.inheritance.Coffee;

public class CoffeeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CoffeeRunner");
		
		Coffee coffee=new Coffee();
        System.out.println(coffee.brand);
        System.out.println(coffee.price);
        System.out.println(coffee.quality);
        System.out.println(coffee.taste);
        
        BlackCoffee blackCoffee=new BlackCoffee();
        System.out.println(blackCoffee.brand);
        System.out.println(blackCoffee.quality);
        System.out.println(blackCoffee.taste);
        System.out.println(blackCoffee.price);
	}

}
