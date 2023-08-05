package com.xworkz.app.inheritance;

public class NylonRope extends Rope {
	
	public NylonRope(String brand,boolean strength,double price,boolean tensile)
	{
		 super(brand,strength,price,tensile);
    	 System.out.println("invoking const in NylonRope");
	}
	public NylonRope()
	{
		 super("Cottton Rope",true,100,true);
    	 System.out.println("invoking no-arg const in NylonRope");
	}

}
