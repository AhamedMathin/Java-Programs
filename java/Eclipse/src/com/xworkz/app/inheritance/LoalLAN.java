package com.xworkz.app.inheritance;

public class LoalLAN  extends Router{
	public LoalLAN(String name,int ports,boolean connectivity,double price)
	
	{
		 super(name,ports,connectivity,price);
    	 System.out.println("invoking const in LocalLAN");
	}
	public LoalLAN()
	{
		 super("TP-Link",4,true,2000);
    	 System.out.println("invoking no-arg const in LocalLAN");
	}

}
