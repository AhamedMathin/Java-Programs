package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.NationalZoo;
import com.xworkz.app.inheritance.StateZoo;
import com.xworkz.app.inheritance.Zoo;
import com.xworkz.app.inheritance.util.Zooutil;

public class ZooRunner {

	public static void main(String[] args) {

		System.out.println("invoking main of ZooRunner");
		Zoo zoo = new Zoo();
		Zooutil.run(zoo);

		Zoo zoo2 = new StateZoo();
		StateZoo stateZoo = (StateZoo) zoo2;
		Zooutil.run(stateZoo);

		Zoo zoo3 = new NationalZoo();
		NationalZoo nationalZoo = (NationalZoo) zoo3;
		Zooutil.run(nationalZoo);

	}

}
