package com.xworkz.app.method.overload.override;

public class Library {
	public String name;
	public String location;
	public double price;
	public int noOfBooks;
	public int pinCode;

	public void read() {
		System.out.println("invoking  read in Library");
	}

	public void read(String name) {
		System.out.println("invoking String  read in Library");
		
	}

	public void read(String name, String location) {
		System.out.println("invoking String,String  read in Library");
	
	}

	public void read(String name, String location, double price) {
		System.out.println("invoking String,String,double  read in Library");
	
	}

	public void read(String name, String location, double price,int noOfBooks) {
		System.out.println("invoking String,String,double,int  read in Library");
	
	}

	public void read(String name, String location, double price,int noOfBooks, int pinCode) {
		System.out.println("invoking String,String,double,int,int  read in Library");
		
	}
}
