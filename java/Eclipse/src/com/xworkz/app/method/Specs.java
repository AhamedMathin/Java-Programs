package com.xworkz.app.method;

public class Specs {
	public String type;
	public double power;

	public void lens() {
		System.out.println("invoking no-arg method leans in Specs ");
		lens(1.5);
		lens("concave");
	}

	public void lens(String type) {
		System.out.println("invoking String lens in Specs ");
		System.out.println("type:" + type);
	}

	public void lens(double power) {
		System.out.println("invoking double lens in Specs ");
		System.out.println("power:" + power);
	}

	public void lens(String type, double power) {
		System.out.println("invoking String,double lens in Specs ");
		lens(type);
		lens(power);
	}
}
