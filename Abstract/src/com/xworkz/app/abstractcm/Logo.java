package com.xworkz.app.abstractcm;

public class Logo {
	private String brand;
	private boolean patent;
	private double cost;
	private String indicates;
	private int period;

	public Logo() {

	}

	public Logo(String brand) {
		super();
		this.brand = brand;
	}

	public Logo(String brand, boolean patent, String indicates, int period) {
		super();
		this.brand = brand;
		this.patent = patent;
		this.indicates = indicates;
		this.period = period;
	}

	public Logo(String brand, boolean patent, double cost, String indicates, int period) {
		super();
		this.brand = brand;
		this.patent = patent;
		this.cost = cost;
		this.indicates = indicates;
		this.period = period;
	}

	@Override
	public String toString() {

		return "Brand :"+ brand +"Patent Years :"+ patent +"Cost:"+ cost +"indicates"+ indicates +"period"+period;
	}

}
