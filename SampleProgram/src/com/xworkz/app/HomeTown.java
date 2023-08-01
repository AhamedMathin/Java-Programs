package com.xworkz.app;

public class HomeTown {
public String name;
public int pinCode;
public Area[] area;
public HomeTown(String name,int pinCode,Area[] area) {
	this.name=name;
	this.pinCode=pinCode;
	this.area=area;

}
public void printInfo() {
	System.out.println("Name:"+this.name);
	System.out.println("PinCode :"+this.pinCode);
	for (int index = 0; index <this.area.length; index++) {
		Area area1=this.area[index];
		area1.printInfo();
	}
	
		
}
}
