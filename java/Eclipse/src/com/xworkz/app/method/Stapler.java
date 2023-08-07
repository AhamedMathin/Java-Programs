package com.xworkz.app.method;

public class Stapler {
	public String materialType;
	public int noOfLevel;

	public void staple() {
		System.out.println("invoking no-arg method staple in Stapler ");
		staple(8);
		staple("Zinc");
	}

	public void staple(String materialType) {
		System.out.println("invoking String staple in Stapler ");
		System.out.println("MaterialType:" + materialType);
	}

	public void staple(int noOfLevel) {
		System.out.println("invoking int staple in Stapler");
		System.out.println("Level:" + noOfLevel);
	}

	public void staple(String materialType, int noOfLevel) {
		System.out.println("invoking String,int staple in Stapler ");
		staple(materialType);
		staple(noOfLevel);
	}

}
