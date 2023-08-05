package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.Gold;
import com.xworkz.app.inheritance.YellowGold;

public class GoldRunner {

      public static void main(String[] args) {
			System.out.println("invoking main in GoldRunner");

			Gold gold = new Gold();
			System.out.println(gold.brand);
			System.out.println(gold.grams);
			System.out.println(gold.price);
			System.out.println(gold.type);

			YellowGold yellowGold = new YellowGold();
			System.out.println(yellowGold.brand);
			System.out.println(yellowGold.grams);
			System.out.println(yellowGold.price);
			System.out.println(yellowGold.type);
	}
}
