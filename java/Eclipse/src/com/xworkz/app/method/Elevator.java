package com.xworkz.app.method;

public class Elevator {
	public String type;
	public int noOfFloor;

	public void carry() {
		System.out.println("invoking no-arg method carry in Elevator ");
		carry(15);
		carry("Stone Flooring");
	}

	public void carry(String type) {
		System.out.println("invoking String carry in Elevator ");
		System.out.println("Type:" + type);
	}

	public void carry(int noOfFloor) {
		System.out.println("invoking int carry in Elevator");
		System.out.println("FloorLevel:" + noOfFloor);
	}

	public void carry(String type, int noOfFloor) {
		System.out.println("invoking String,int carry in Elevator");
		carry(type);
		carry(noOfFloor);
	}

}
