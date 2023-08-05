package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.NylonRope;
import com.xworkz.app.inheritance.Rope;

public class RopeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in RopeRunner");
		
		Rope rope=new Rope();
		System.out.println(rope.brand);
		System.out.println(rope.strength);
		System.out.println(rope.price);
		System.out.println(rope.tensile);
		
		NylonRope nylonRope=new NylonRope();
		System.out.println(nylonRope.brand);
		System.out.println(nylonRope.strength);
		System.out.println(nylonRope.price);
		System.out.println(nylonRope.tensile);
	}

}
