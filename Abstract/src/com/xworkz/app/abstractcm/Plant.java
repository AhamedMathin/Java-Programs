package com.xworkz.app.abstractcm;

public class Plant  extends Tree{
	@Override
	public void water() {
	System.out.println("invoking water in Plant");
		
	}
	@Override
	public void care() {
		System.out.println("invoking care in Plant");
		
	}
	@Override
	public void grow() {
		System.out.println("invoking grow in Plant");
		
	}
	@Override
	public void nurtue() {
		System.out.println("invoking nurture in Plant");
		
	}
	@Override
	public boolean growth() {
		System.out.println("invoking growth in Plant");
		return false;
	}

}
