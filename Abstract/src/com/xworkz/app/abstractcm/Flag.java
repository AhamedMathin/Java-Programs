package com.xworkz.app.abstractcm;

public class Flag {
	private String name;
	private double price;
	private String indicate;

	public Flag() {

	}

	public Flag(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Flag(String name, double price, String indicate) {
		super();
		this.name = name;
		this.price = price;
		this.indicate = indicate;
	}

	@Override
	public String toString() {

		return "Name  :" + name + " Price :" + price + " Indicat's :" + indicate;
	}

}
