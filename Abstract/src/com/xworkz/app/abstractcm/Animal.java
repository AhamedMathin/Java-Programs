package com.xworkz.app.abstractcm;

public abstract class Animal {
	public abstract void walk();

	public abstract void sound();

	public abstract void eat();

	public abstract void run();

	public abstract boolean care();

	public void caring() {
		System.out.println("invoking caring in animal");
	}

	public void walking() {
		System.out.println("invoking walking in animal ");
	}

	public void eats() {
		System.out.println("invoking eats in animal");
	}

	public void runs() {
		System.out.println("invoking runs in animal");
	}

	public boolean makeSound() {
		System.out.println("invoking make sound in animal");
		return false;

	}

}
