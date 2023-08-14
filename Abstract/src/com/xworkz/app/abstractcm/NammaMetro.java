package com.xworkz.app.abstractcm;

public class NammaMetro extends Metro {

	@Override
	public void stop() {
		System.out.println("invoking stop in NammoMetro");

	}

	@Override
	public void move() {
		System.out.println("invoking move in NammoMetro");

	}

	@Override
	public void signal() {
		System.out.println("invoking signal in NammoMetro");
	}

	@Override
	public void ticket() {
		System.out.println("invoking ticket in NammoMetro");

	}

	@Override
	public boolean entry() {
		System.out.println("invoking entry in NammoMetro");
		return false;
	}
}
