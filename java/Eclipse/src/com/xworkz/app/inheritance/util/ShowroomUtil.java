package com.xworkz.app.inheritance.util;

import com.xworkz.app.inheritance.MobileShowroom;
import com.xworkz.app.inheritance.Showroom;
import com.xworkz.app.inheritance.WatchShowroom;

public class ShowroomUtil {

	
	
	public static  void run(Showroom showroom)
	{

	System.out.println(showroom.location);
	showroom.sell();
	// Avoid class cast exception
	if(showroom instanceof WatchShowroom)
	{

	System.out.println("showroom is watchshowroom");

	WatchShowroom watchShowroom =(WatchShowroom) showroom;//casting

	System.out.println(watchShowroom.since);
	watchShowroom.discount();

	}

	if(showroom instanceof MobileShowroom)
	{
	System.out.println("show room is mobile showroom");

	MobileShowroom mobileShowroom=(MobileShowroom) showroom;

	System.out.println(mobileShowroom.pincode);
	mobileShowroom.freeGift();
	}
	}
}
