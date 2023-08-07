package com.xworkz.app.method;

public class IronBox {
	public String type;
	public int power;

	public void heat() {
		System.out.println("invoking no-arg method heat in Ironbox ");
		heat(75);
		heat("cotton");
	}

	public void heat(String type) {
		System.out.println("invoking String heat in Ironbox ");
		System.out.println("type:" + type);
	}

	public void heat(int power) {
		System.out.println("invoking int heat in Ironbox ");
		System.out.println("power:" + power);
	}

	public void heat(String type, int power) {
		System.out.println("invoking String,int heat in Ironbox ");
	    heat(type);
	    heat(power);
	}
}
