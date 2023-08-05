package com.xworkz.app.inheritance;

public class Router {
    public String name;
    public int ports;
    public boolean connectivity;
    public  double price; 
    
    public Router() {
    	 this("LAN Solo",5,true,1500);
			System.out.println("Invoking no-arg const in Router");
    }
    public Router(String name,int ports,boolean connectivity,double price)
    {
    	System.out.println("Invoking String,int,double,double  in Router");
		this.name=name;
		this.ports=ports;
		this.connectivity=connectivity;
		this.price=price;
    }
}
