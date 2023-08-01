package com.xworkz.app.boot;

import com.xworkz.app.Ingredent;
import com.xworkz.app.Toothpaste;

public class ToothpasteKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in ToothPasteKiller");

		Ingredent ingredients = new Ingredent("clove", 250, 25.9);
		Ingredent ingredients1 = new Ingredent("salt", 50, 35);
		Ingredent ingredients2 = new Ingredent("mint", 25, 20);
		Ingredent ingredients3 = new Ingredent("charcoal", 35, 40);
		Ingredent ingredients4 = new Ingredent("Tulsi", 45, 90);

		System.out.println("***********************************************************************");
		Ingredent[] ingredentsRef = { ingredients, ingredients1, ingredients2, ingredients3, ingredients4 };

		Toothpaste toothpaste = new Toothpaste("Patanjali", "Dantkanti", ingredentsRef);

		System.out.println("***********************************************************************");
		toothpaste.printInfo();
		System.out.println("***********************************************************************");

	}

}
