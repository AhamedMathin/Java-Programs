package com.xworkz.app;

public class Toothpaste {

	public String name;
	public String brand;
	public Company company = new Company("Colgate","Prabha Narasimhan", "India");
	public Ingredent[] ingredents;

	public Toothpaste(String name, String brand, Ingredent[] ingredents) {
		System.out.println("Invoking constructor in ToothPaste");
		this.name = name;
		this.brand = brand;
		this.ingredents = ingredents;
	}

	public void printInfo() {
		System.out.println("invoking printInfo in ToothPaste");
		System.out.println("Name of the ToothPaste is " + this.name);
		System.out.println("Brand of the ToothPaste " + this.brand);
		for (int i = 0; i < this.ingredents.length; i++) {
			Ingredent ref = this.ingredents[i];
			ref.printInfo();

		}

		company.printInfo();
	}

}
