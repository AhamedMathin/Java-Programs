package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.method.overload.override.AnimalZoo;
import com.xworkz.app.method.overload.override.Bakery;
import com.xworkz.app.method.overload.override.Banglore;
import com.xworkz.app.method.overload.override.ChunkStreet;
import com.xworkz.app.method.overload.override.City;
import com.xworkz.app.method.overload.override.GvtHospital;
import com.xworkz.app.method.overload.override.Hospital;
import com.xworkz.app.method.overload.override.Hostel;
import com.xworkz.app.method.overload.override.Hotel;
import com.xworkz.app.method.overload.override.KrMarket;
import com.xworkz.app.method.overload.override.Library;
import com.xworkz.app.method.overload.override.Local;
import com.xworkz.app.method.overload.override.LuLuMall;
import com.xworkz.app.method.overload.override.Mall;
import com.xworkz.app.method.overload.override.Market;
import com.xworkz.app.method.overload.override.NewTemple;
import com.xworkz.app.method.overload.override.OldHostel;
import com.xworkz.app.method.overload.override.Orion;
import com.xworkz.app.method.overload.override.Panchami;
import com.xworkz.app.method.overload.override.PoliceStation;
import com.xworkz.app.method.overload.override.Pub;
import com.xworkz.app.method.overload.override.PublicLibrary;
import com.xworkz.app.method.overload.override.Street;
import com.xworkz.app.method.overload.override.SweetBakery;
import com.xworkz.app.method.overload.override.Temple;
import com.xworkz.app.method.overload.override.Theater;
import com.xworkz.app.method.overload.override.Tonique;
import com.xworkz.app.method.overload.override.Zoo;

public class OverLoadRide {

	public static void main(String[] args) {
		System.out.println("invoking main of Method overload and ride");

		Bakery bakery = new SweetBakery();
		bakery.taste("Ganesh Bakery", "Banglore");
		;
		SweetBakery sweetBakery = new SweetBakery();
		sweetBakery.taste();

		System.out.println("############################################");
		Hotel hotel = new Panchami();
		hotel.stay();
		Panchami panchami = new Panchami();
		panchami.stay(null);

		System.out.println("############################################");
		Hospital hospital = new GvtHospital();
		hospital.visit();
		GvtHospital gvtHospital = new GvtHospital();
		gvtHospital.visit(null);
		gvtHospital.visit();

		System.out.println("############################################");
		Hostel hostel = new OldHostel();
		hostel.leave();
		OldHostel oldHostel = new OldHostel();
		oldHostel.leave();

		System.out.println("############################################");
		Mall mall = new LuLuMall();
		mall.see(null);
		LuLuMall luLuMall = new LuLuMall();
		luLuMall.see();

		System.out.println("############################################");
		Theater theater = new Orion();
		theater.watch(null);
		Orion orion = new Orion();
		orion.watch();

		System.out.println("############################################");
		Library library = new PublicLibrary();
		library.read(null);
		PublicLibrary publicLibrary = new PublicLibrary();
		publicLibrary.read();

		System.out.println("############################################");
		Temple temple = new NewTemple();
		temple.realx();
		NewTemple newTemple = new NewTemple();
		newTemple.realx();

		System.out.println("############################################");
		Market market = new KrMarket();
		market.buy();
		KrMarket krMarket = new KrMarket();
		krMarket.buy();

		System.out.println("############################################");
		City city = new Banglore();
		city.travel();
		Banglore banglore = new Banglore();
		banglore.travel();

		System.out.println("############################################");
		Zoo zoo = new AnimalZoo();
		zoo.click();
		AnimalZoo animalZoo = new AnimalZoo();
		animalZoo.click();

		System.out.println("############################################");
		Street street = new ChunkStreet();
		street.walk();
		ChunkStreet chunkStreet = new ChunkStreet();
		chunkStreet.walk();

		System.out.println("############################################");
		Pub pub = new Tonique();
		pub.drink();
		Tonique tonique = new Tonique();
		tonique.drink();

		System.out.println("############################################");
		PoliceStation policeStation = new Local();
		policeStation.arrest();
		Local local = new Local();
		local.arrest();
	}

}
