package com.xowkz.app.runner;

import com.xworkz.app.abstractcm.Animal;
import com.xworkz.app.abstractcm.Banglow;
import com.xworkz.app.abstractcm.Bulding;
import com.xworkz.app.abstractcm.FuturePlan;
import com.xworkz.app.abstractcm.Life;
import com.xworkz.app.abstractcm.Metro;
import com.xworkz.app.abstractcm.NammaMetro;
import com.xworkz.app.abstractcm.Plant;
import com.xworkz.app.abstractcm.Tiger;
import com.xworkz.app.abstractcm.Tree;

public class AllAbstact {

	public static void main(String[] args) {
		System.out.println("invoking main in AllAbstract");

		Metro metro = new NammaMetro();
		metro.moving();
		metro.stoping();
		metro.ticketing();
		metro.motion();
		metro.starting();
		System.out.println("Abstract");
		metro.entry();
		metro.move();
		metro.signal();
		metro.stop();
		metro.ticket();

		System.out.println("*****************************************************");
		Tree tree = new Plant();
		tree.flower();
		tree.fruit();
		tree.caring();
		tree.watering();
		tree.releaf();
		System.out.println("Abstract");
		tree.care();
		tree.grow();
		tree.growth();
		tree.nurtue();
		tree.water();

		System.out.println("*****************************************************");
		Animal animal = new Tiger();
		animal.caring();
		animal.eats();
		animal.runs();
		animal.makeSound();
		animal.walking();
		System.out.println("Abstract");
		animal.care();
		animal.eat();
		animal.sound();
		animal.walk();
		animal.run();

		System.out.println("*****************************************************");
		Bulding bulding = new Banglow();
		bulding.guarding();
		bulding.watering();
		bulding.working();
		bulding.caring();
		bulding.growth();
		System.out.println("Abstract");
		bulding.water();
		bulding.care();
		bulding.work();
		bulding.cost();
		bulding.construct();

		System.out.println("*****************************************************");
		Life life = new FuturePlan();
		life.yourself();
		life.walking();
		life.eats();
		life.execution();
		life.findPurpose();
		System.out.println("Abstract");
		life.round();
		life.dep();
		life.code();
		life.run();
		life.execute();

	}

}
