package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.BlackMushroom;
import com.xworkz.app.inheritance.Mushroom;

public class MushroomRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MushroomRunner ");

		
		Mushroom mushroom=new Mushroom("Button Mushrooms","mildest-tasting",250);
		System.out.println(mushroom.name);
		System.out.println(mushroom.type);
		System.out.println(mushroom.price);
		System.out.println(mushroom.edible);
		
		BlackMushroom blackMushroom=new BlackMushroom();
		System.out.println(blackMushroom.name);
		System.out.println(blackMushroom.type);
		System.out.println(blackMushroom.price);
		System.out.println(blackMushroom.edible);
	}

}
