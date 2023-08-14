package com.xworkz.app.abstractcm;

public abstract class Life {
	public abstract void round();

	public abstract void dep();

	public abstract void code();

	public abstract void run();

	public abstract void execute();

	public void yourself() {
		System.out.println("invoking yourself in Life");
	}

	public void walking() {
		System.out.println("invoking walking in Life ");
	}

	public void eats() {
		System.out.println("invoking eats in Life");
	}

	public void execution() {
		System.out.println("invoking execution in Life");
	}

	public void findPurpose() {
		System.out.println("invoking Finding Purpose in Life");
		

	}

}
