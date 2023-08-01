package com.xworkz.app;

public class Floor {
	public String name;
	public int numbers;
	  public Floor(String name,int numbers) {
		  System.out.println("invoking constructor in Floor");
		  this.name=name;
		  this.numbers=numbers;
	  }
	  public void printInfo() {
		  System.out.println("Name :"+this.name);
		  System.out.println("Number of Floor:"+this.numbers);
	  }
}
