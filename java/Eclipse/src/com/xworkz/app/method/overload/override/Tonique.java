package com.xworkz.app.method.overload.override;

public class Tonique  extends Pub{
	@Override
	public void drink() {
		System.out.println("invoking drink in Tonique");
	}
	public void drive() {
		System.out.println("invoking the drive method in Tonique");
	}

}
