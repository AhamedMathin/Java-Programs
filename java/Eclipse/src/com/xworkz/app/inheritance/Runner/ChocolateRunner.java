package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.CarmelChocolate;
import com.xworkz.app.inheritance.Chocolate;
import com.xworkz.app.inheritance.DarkChocolate;
import com.xworkz.app.inheritance.util.ChocolateUtil;


public class ChocolateRunner {

	public static void main(String[] args) {

		System.out.println("invoking main of ChocolateRunner");
		Chocolate chocolate = new Chocolate();
		ChocolateUtil.run(chocolate);

		Chocolate chocolate2=new DarkChocolate();
        DarkChocolate darkChocolate=(DarkChocolate) chocolate2;
		ChocolateUtil.run(darkChocolate);

		Chocolate chocolate3=new CarmelChocolate();
        CarmelChocolate carmelChocolate=(CarmelChocolate) chocolate3;
		ChocolateUtil.run(carmelChocolate);
		
	}

}
