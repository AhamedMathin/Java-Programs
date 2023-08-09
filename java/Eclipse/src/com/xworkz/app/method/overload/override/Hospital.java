package com.xworkz.app.method.overload.override;

public class Hospital {
	public String name;
	public String location;
	public double price;
	public int rate;
	public int pinCode;

	public void visit() {
		System.out.println("invoking  visit in Hospital");
	}

	public void visit(String name) {
		System.out.println("invoking String visit in Hospital");
		
	}

	public void visit(String name, String location) {
		System.out.println("invoking String,String visit in Hospital");
	
	}

	public void visit(String name, String location, double price) {
		System.out.println("invoking String,String,double visit in Hospital");
	
	}

	public void visit(String name, String location, double price,int rate) {
		System.out.println("invoking String,String,double,int visit in Hospital");
	
	}

	public void visit(String name, String location, double price,int rate, int pinCode) {
		System.out.println("invoking String,String,double,int,int visit in Hospital");
		
	}

}
