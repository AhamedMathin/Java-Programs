package com.xworkz.app.method.overload.override;

public class Panchami extends Hotel {

	@Override
	public void stay(String name) {
		System.out.println("invoking string  Stay in Panchami");
	}

	public void visit() {
		System.out.println("invoking visit in Panchami");
	}
}
