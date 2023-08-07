package com.xworkz.app.method;

public class Mouse {
	public String functions;
	public int noOfButtons;

	public void scroll() {
		System.out.println("invoking no-arg method scroll in Mouse ");
		scroll(2);
		scroll("Copy and Paste");
	}

	public void scroll(String functions) {
		System.out.println("invoking String scroll in Mouse  ");
		System.out.println("Functions:" + functions);
	}

	public void scroll(int noOfButtons) {
		System.out.println("invoking int scroll in Mouse ");
		System.out.println("Buttons:" + noOfButtons);
	}

	public void scroll(String functions, int noOfButtons) {
		System.out.println("invoking String,int scroll in Mouse ");
		scroll(functions);
		scroll(noOfButtons);
	}
}
