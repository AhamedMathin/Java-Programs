package com.xworkz.app;



public class Lift {
 public int number;
  public Lift(int number) {
	  System.out.println("invoking constructor in Lift");
	  this.number=number;
  }
  public void printInfo()
  {
	 
		System.out.println("lift numberis "+this.number);
	  
  }
}
