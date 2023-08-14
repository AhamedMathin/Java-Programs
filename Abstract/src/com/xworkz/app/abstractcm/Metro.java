package com.xworkz.app.abstractcm;

public abstract class Metro {
	
	public abstract void stop();
	public abstract void move();
	public abstract void signal();
	public abstract void ticket();
	public abstract boolean entry();

	public void moving() {
		System.out.println("invoking moving in Metro");
	}
	public void stoping() {
		System.out.println("invoking stoping in Metro");
	}

	public void ticketing() {
		System.out.println("invoking ticketing in Metro");
	}
	public void starting() {
		System.out.println("invoking starting in Metro");
	}
	public boolean motion() {
		System.out.println("invoking starting in Metro");
		return false;
		
		
	}
	
}
