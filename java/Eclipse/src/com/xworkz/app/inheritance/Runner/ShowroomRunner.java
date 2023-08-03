package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.MobileShowroom;
import com.xworkz.app.inheritance.Showroom;
import com.xworkz.app.inheritance.WatchShowroom;
import com.xworkz.app.inheritance.util.ShowroomUtil;

public class ShowroomRunner {

	public static void main(String[] args) {
		System.out.println("invoking main of ShrowroomRunner");

		Showroom showroom = new Showroom();
		ShowroomUtil.run(showroom);

		Showroom showroom2 = new WatchShowroom();
		WatchShowroom watchShowroom = (WatchShowroom) showroom2;
		ShowroomUtil.run(watchShowroom);

		Showroom showroom3=new MobileShowroom();
		MobileShowroom mobileShowroom=(MobileShowroom) showroom3;
		ShowroomUtil.run(mobileShowroom);
	}

}
