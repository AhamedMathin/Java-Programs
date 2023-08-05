package com.xworkz.app.inheritance;

public class BlackMushroom  extends Mushroom{
	
	
	public BlackMushroom(String name,String type,double price,boolean edibile) {
		super(name,type,price,edibile);
		System.out.println("invoking  const in BlackMushroom ");
	}
	public BlackMushroom()
	{
		super("Beech Mushrooms","delicate and tender",450,true);
		System.out.println("invoking no-arg const in  BlackMushroom  ");
	}

}
