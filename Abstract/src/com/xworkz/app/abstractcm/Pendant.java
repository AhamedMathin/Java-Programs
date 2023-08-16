package com.xworkz.app.abstractcm;

public class Pendant {
	private String material;
	private int length;
	private int width;
	private String color;
	private boolean isPrecious;
	private boolean isAntique;
	private String gemstone;
	private boolean hasChain;
	private String design;
	private int weightGrams;
	private boolean isEngraved;
	private String symbol;
	private String place;
	private double cost;

	public Pendant() {

	}

	public Pendant(String material, String color) {
		super();
		this.material = material;
		this.color = color;
	}

	public Pendant(String material, int length, int width, String color, boolean isPrecious, boolean isAntique,
			String gemstone, boolean hasChain, String design, int weightGrams, boolean isEngraved, String symbol,
			String place, double cost) {
		super();
		this.material = material;
		this.length = length;
		this.width = width;
		this.color = color;
		this.isPrecious = isPrecious;
		this.isAntique = isAntique;
		this.gemstone = gemstone;
		this.hasChain = hasChain;
		this.design = design;
		this.weightGrams = weightGrams;
		this.isEngraved = isEngraved;
		this.symbol = symbol;
		this.place = place;
		this.cost = cost;
	}

	@Override
	public String toString() {

		return "material:" + material + "length:" + length + "width:" + width + "color" + color + "isprecious:"
				+ isPrecious + "Antique" + isAntique + "gemstone" + gemstone + "mineralComp" + hasChain
				+ "entrace width" + design + "height" + weightGrams + "bool" + symbol + "bool" + isEngraved + "place"
				+ place + "Cost" + cost;
	}

}
