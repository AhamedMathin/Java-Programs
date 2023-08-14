package com.xworkz.app.abstractcm;

public class Tiger extends Animal {

	@Override
	public void walk() {
		System.out.println("invoking walk in Tiger");

	}

	@Override
	public void sound() {
		System.out.println("invoking sound in Tiger");

	}

	@Override
	public void eat() {
		System.out.println("invoking eat in Tiger");

	}

	@Override
	public void run() {
		System.out.println("invoking run in Tiger");

	}

	@Override
	public boolean care() {
		System.out.println("invoking care in Tiger");
		return false;
	}

}
