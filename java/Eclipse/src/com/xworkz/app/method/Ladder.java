package com.xworkz.app.method;

public class Ladder {
	public String materialType;
	public double price;

	public void fold() {
		System.out.println("invoking no-arg method fold in Ladder ");
		fold("wood");
		fold(1000);
	}

	public void fold(String materialType) {
		System.out.println("invoking String  fold in Ladder ");
		System.out.println("MaterialType:" + materialType);
	}

	public void fold(double price) {
		System.out.println("invoking double fold in Ladder ");
		System.out.println("Cost:" + price);
	}

	public void fold(String materialType, double price) {
		System.out.println("invoking String,double  fold in Ladder ");
		fold(materialType);
		fold(price);
	}

}
