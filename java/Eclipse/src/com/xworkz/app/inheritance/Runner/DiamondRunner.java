package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.Diamond;
import com.xworkz.app.inheritance.Emerald;


public class DiamondRunner {

	public static void main(String[] args) {
System.out.println("invoking main in DiamondRunner");
		Diamond diamond=new Diamond();
		System.out.println(diamond.brand);
		System.out.println(diamond.grams);
		System.out.println(diamond.price);
		System.out.println(diamond.type);
		
		Emerald emerald =new Emerald();
		System.out.println(emerald.brand);
		System.out.println(emerald.grams);
		System.out.println(emerald.price);
		System.out.println(emerald.type);
	}

}
