package com.xworkz.app.inheritance.util;

import com.xworkz.app.inheritance.NationalZoo;
import com.xworkz.app.inheritance.StateZoo;
import com.xworkz.app.inheritance.Zoo;

public class Zooutil {
	public static void run(Zoo zoo) {

		System.out.println(zoo.name);
		zoo.clean();

		if (zoo instanceof StateZoo) {

			System.out.println("Zoo is StateZoo ");
			StateZoo stateZoo = (StateZoo) zoo;// casting

			System.out.println(stateZoo.location);
			stateZoo.type();

		}

		if (zoo instanceof NationalZoo) {
			System.out.println("Zoo in NationalZoo ");
			NationalZoo nationalZoo = (NationalZoo) zoo;

			System.out.println(nationalZoo.pincode);
			nationalZoo.see();
		}
	}
}
