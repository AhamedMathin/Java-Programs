package com.xworkz.app.method.overload.override;

public class PoliceStation {
	public String name;
	public String location;
	public String type;
	public String State;
	public int pinCode;

	public void arrest() {
		System.out.println("invoking arrest in PoliceStation");
	}

	public void arrest(String name) {
		System.out.println("invoking String arrest in PoliceStation");

	}

	public void arrest(String name, String location) {
		System.out.println("invoking String,String arrest in PoliceStation");

	}

	public void arrest(String name, String location, String type) {
		System.out.println("invoking String,String,String arrest in PoliceStation");

	}

	public void arrest(String name, String location, String type, String state) {
		System.out.println("invoking String,String,String,String arrest in PoliceStation");

	}

	public void arrest(String name, String location, String type, String state, int pinCode) {
		System.out.println("invoking String,String,String,String,int arrest in PoliceStation");

	}

}
