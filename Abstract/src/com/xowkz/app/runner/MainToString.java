package com.xowkz.app.runner;

import com.xworkz.app.abstractcm.Cave;
import com.xworkz.app.abstractcm.Flag;
import com.xworkz.app.abstractcm.Karchief;
import com.xworkz.app.abstractcm.Logo;
import com.xworkz.app.abstractcm.Pendant;

public class MainToString {
	public static void main(String[] args) {
		System.out.println("invoking main in ToString");

		Flag flag = new Flag();
		System.out.println(flag);
		Flag flag2 = new Flag("Tringa", 15);
		System.out.println(flag2);
		Flag flag3 = new Flag("Tringa", 15, "Peace");
		System.out.println(flag3);
		System.out.println("*********************************");

		Logo logo = new Logo();
		System.out.println(logo);
		Logo logo2 = new Logo("Meta");
		System.out.println(logo2);
		Logo logo3 = new Logo("MakeOver", true, "Work to Strive", 6);
		System.out.println(logo3);
		System.out.println("*********************************");

		Karchief karchief = new Karchief();
		System.out.println(karchief);
		Karchief karchief1 = new Karchief("Ramond", true);
		System.out.println(karchief1);
		Karchief karchief3 = new Karchief("Vevlet", 'M', 15, 10, 100, true, "Banglore");
		System.out.println(karchief3);
		System.out.println("*********************************");

		Cave cave = new Cave();
		System.out.println(cave);
		Cave cave1 = new Cave(100, "india");
		System.out.println(cave1);
		Cave cave3 = new Cave(150, 100, "india", false, 5, 4, false, null, 5, 3, false, false);
		System.out.println(cave3);
		System.out.println("*********************************");

		Pendant pendant = new Pendant();
		System.out.println(pendant);
		Pendant pendant1 = new Pendant("alore", "green");
		System.out.println(pendant1);

		Pendant pendant2 = new Pendant("smooth", 4, 6, "red", false, false, null, false, "pure", 5, false, null, null,
				5000);
		System.out.println(pendant2);
	}

}
