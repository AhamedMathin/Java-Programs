package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.method.Elevator;
import com.xworkz.app.method.Gadget;
import com.xworkz.app.method.Hotel;
import com.xworkz.app.method.IronBox;
import com.xworkz.app.method.Ladder;
import com.xworkz.app.method.Mouse;
import com.xworkz.app.method.Pillar;
import com.xworkz.app.method.Specs;
import com.xworkz.app.method.Stapler;
import com.xworkz.app.method.Umberlla;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("invoing main method ");
		IronBox ironBox = new IronBox();
		ironBox.heat();
		ironBox.heat("nylon", 177);

		System.out.println("#####################################");
		Hotel hotel = new Hotel();
		hotel.eat();
		hotel.eat("Full Meal", 150);

		System.out.println("#####################################");
		Specs specs = new Specs();
		specs.lens();
		specs.lens("convex", 1.7);

		System.out.println("#####################################");
		Umberlla umberlla = new Umberlla();
		umberlla.protect();
		umberlla.protect("normal", 250);

		System.out.println("#####################################");
		Stapler stapler = new Stapler();
		stapler.staple();
		stapler.staple("Aluminum", 7);

		System.out.println("#####################################");
		Ladder ladder = new Ladder();
		ladder.fold();
		ladder.fold("steel", 2500);

		System.out.println("#####################################");
		Elevator elevator = new Elevator();
		elevator.carry();
		elevator.carry("Steel", 15);

		System.out.println("#####################################");
		Mouse mouse = new Mouse();
		mouse.scroll();
		mouse.scroll("Select Folder", 1);

		System.out.println("#####################################");
		Gadget gadget = new Gadget();
		gadget.use();
		gadget.use("200MP", 300);

		System.out.println("#####################################");
		Pillar pillar = new Pillar();
		pillar.build();
		pillar.build("Ionic", 4);

	}

}
