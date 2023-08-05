package com.xworkz.app.inheritance;

public class CricketGround  extends Ground{
	public CricketGround(String name,String location, int acquriments,boolean parking) 
	
	{
	    super(name,location,acquriments,parking);
    	 System.out.println("invoking const in CricketGround");
	}

public CricketGround() {
	 super("Nehru Stadium","Chennai",200000,true);
	 System.out.println("invoking no-arg const in CricketGround");	
}


}
