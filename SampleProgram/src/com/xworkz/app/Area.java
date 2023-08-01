package com.xworkz.app;

public class Area {
public String name;
//public Corporator corporator;
public Corporator corporator1=new Corporator("");
public Area(String name,Corporator corporator)
{
	this.name=name;
	this.corporator=corporator;
}
  public void printInfo() {
	  System.out.println("name :"+this.name);
	  System.out.println("Corporator :"+this.corporator);
	  corporator.printInfo();
	  
  }
}
