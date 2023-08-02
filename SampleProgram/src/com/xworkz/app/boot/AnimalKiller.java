package com.xworkz.app.boot;
import com.xworkz.app.inheritance.*;
public class AnimalKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in AnimalKiller");
		
		
		
		 Animal animal = new Animal();
	        animal.sound();

	        Mammal mammal = new Mammal();
	        mammal.sound();
	        mammal.liveBirth();

	        Dog dog = new Dog();
	        dog.sound();
	        dog.liveBirth();
	        dog.bark();

	        GoldenRetriever goldenRetriever = new GoldenRetriever();
	        goldenRetriever.sound();
	        goldenRetriever.liveBirth();
	        goldenRetriever.bark();
	        goldenRetriever.fetch();

	        DogPuppy dogPuppy = new DogPuppy();
	        dogPuppy.sound();
	        dogPuppy.liveBirth();
	        dogPuppy.bark();
	        dogPuppy.cuteSound();

	        Cat cat = new Cat();
	        cat.sound();
	        cat.liveBirth();
	        cat.meow();

	        Lion lion = new Lion();
	        lion.sound();
	        lion.liveBirth();
	        lion.meow();
	        lion.roar();

	        Panther panther = new Panther();
	        panther.sound();
	        panther.liveBirth();
	        panther.meow();
	        panther.roar();
	        panther.stealth();

	}

}
