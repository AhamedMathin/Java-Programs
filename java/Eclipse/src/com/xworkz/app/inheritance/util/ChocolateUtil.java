package com.xworkz.app.inheritance.util;

import com.xworkz.app.inheritance.CarmelChocolate;
import com.xworkz.app.inheritance.Chocolate;
import com.xworkz.app.inheritance.DarkChocolate;

public class ChocolateUtil {
	public static  void run(Chocolate chocolate)
	{

	System.out.println(chocolate.name);
	chocolate.taste();
	
	if(chocolate instanceof DarkChocolate)
	{

	System.out.println("chocolate is Darkchocolate ");
    DarkChocolate darkChocolate=(DarkChocolate) chocolate;//casting

	System.out.println(darkChocolate.price);
	darkChocolate.smell();

	}

	if(chocolate instanceof CarmelChocolate)
	{
	System.out.println("Chocolate is CarmelChocolate ");
     CarmelChocolate carmelChocolate=(CarmelChocolate) chocolate;

	System.out.println(carmelChocolate.type);
	carmelChocolate.quality();
	}
	}
}
