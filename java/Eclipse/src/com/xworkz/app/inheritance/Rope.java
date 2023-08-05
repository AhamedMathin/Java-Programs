package com.xworkz.app.inheritance;

public class Rope {
	public String brand;
	public boolean strength;
	public double price;
	public boolean tensile;
	 public  Rope()
	 {
		 this("Garware Wall Rope",true,22,true);
			System.out.println("Invoking no-arg const in Rope");
	 }

		public Rope(String brand,boolean strength,double price,boolean tensile)
		{
			System.out.println("Invoking String,boolean,double,boolean in Rope");
			this.brand=brand;
			this.strength=strength;
			this.price=price;
			this.tensile=tensile;
		}

}
