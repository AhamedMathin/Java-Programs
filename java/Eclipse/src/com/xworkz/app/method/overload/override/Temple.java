package com.xworkz.app.method.overload.override;

public class Temple {
	public String name;
	public String location;
	public double price;
	public boolean material ;
	public int pinCode;

	public void realx() {
		System.out.println("invoking  realx in Temple");
	}

	public void realx(String name) {
		System.out.println("invoking String realx in Temple");
		
	}

	public void realx(String name, String location) {
		System.out.println("invoking String,String  realx in Temple");
	
	}

	public void realx(String name, String location, double price) {
		System.out.println("invoking String,String,double  realx in Temple");
	
	}

	public void realx(String name, String location, double price,boolean material) {
		System.out.println("invoking String,String,double,boolean  realx in Temple");
	
	}

	public void realx(String name, String location, double price,boolean material, int pinCode) {
		System.out.println("invoking String,String,double,boolean,int  realx in Temple");
		
	}
}
