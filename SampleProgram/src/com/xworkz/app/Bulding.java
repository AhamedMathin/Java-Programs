package com.xworkz.app;

public class Bulding {

	Floor floor1 = new Floor("First", 101);
	Floor floor2 = new Floor("Second", 201);
	public Floor[] floor = { floor1, floor2 };

	Lift lift1 = new Lift(2);
	Lift lift2 = new Lift(8);
	public Lift[] lift = { lift1, lift2 };

	public Bulding(Floor[] floors, Lift[] lifts) {
		System.out.println("invoking the constructor in Bulding");

	}

	public void printInfo() {
		System.out.println("invoking the printInfo in Bulding");
		for (int index = 0; index < this.floor.length; index++) {
			Floor floor = this.floor[index];
			floor.printInfo();
		}
		for (int step = 0; step < this.lift.length; step++) {
			Lift lift = this.lift[step];
			lift.printInfo();
		}
	}

}
