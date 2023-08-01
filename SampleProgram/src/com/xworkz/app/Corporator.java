package com.xworkz.app;

public class Corporator {
	public String name;
	Bulding building=new Bulding(null, null)
	Bulding building1=new Bulding(null,null);
	public Bulding[] buildings={building,building1};


	public Corporator(String name, Bulding[] buldings) {
		this.name = name;
	}

	public void printInfo() {
		System.out.println("Name :" + this.name);
		for (int index = 0; index < this.buildings.length; index++) {

			Bulding bulding = this.buildings[index];
			bulding.printInfo();
		}

	}
}
