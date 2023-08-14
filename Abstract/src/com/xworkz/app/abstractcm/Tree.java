package com.xworkz.app.abstractcm;

public abstract class Tree {
	public abstract void water();

	public abstract void care();

	public abstract void grow();

	public abstract void nurtue();

	public abstract boolean growth();

	public void caring() {
		System.out.println("invoking caring in Plant");
	}

	public void watering() {
		System.out.println("invoking watering in Plant ");
	}

	public void flower() {
		System.out.println("invoking flower in Plant");
	}

	public void fruit() {
		System.out.println("invoking fruit in plant");
	}

	public boolean releaf() {
		System.out.println("invoking releaf in Plant");
		return false;

	}
}
