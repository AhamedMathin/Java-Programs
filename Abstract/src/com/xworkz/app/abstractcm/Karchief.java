package com.xworkz.app.abstractcm;

public class Karchief {
	private String brand;
	private char size;
	private double height;
	private double width;
	private double cost;
	private boolean quality;
	private String location;
	
	public Karchief() {
		
	}
	

	public Karchief(String brand, boolean quality) {
		super();
		this.brand = brand;
		this.quality = quality;
	}
	


	public Karchief(String brand, char size, double height, double width, double cost) {
		super();
		this.brand = brand;
		this.size = size;
		this.height = height;
		this.width = width;
		this.cost = cost;
	}


	public Karchief(String brand, char size, double height, double width, double cost, boolean quality,
			String location) {
		super();
		this.brand = brand;
		this.size = size;
		this.height = height;
		this.width = width;
		this.cost = cost;
		this.quality = quality;
		this.location = location;
	}
	@Override
	public String toString() {
		
		return "Brand :"+ brand +"Size:"+ size +"Height:"+ height +"width:"+ width +"Cost :"+ cost +"Quality :"+ quality +"Loaction :"+location;
	}
	
	
}
