package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.CricketGround;
import com.xworkz.app.inheritance.Ground;

public class GroundRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GroundRunner");

		Ground ground=new Ground();
		System.out.println(ground.name);
		System.out.println(ground.location);
		System.out.println(ground.acquriments);
		System.out.println(ground.parking);
		
		CricketGround cricketGround=new CricketGround();
		System.out.println(cricketGround.name);
		System.out.println(cricketGround.location);
		System.out.println(cricketGround.acquriments);
		System.out.println(cricketGround.parking);
	}

}
