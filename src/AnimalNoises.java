//added semicolon to the end of import (Andrew Steele 01/10/2023)

//had to add semicolon to the end of import model.Example for program to run (Riley Ahlrichs 1/14/2023)

import model.Example;
import model.Platypus;
import model.Dog;
import model.Cat;
import model.Penguin;
import model.Wolf;
import model.Example;

import model.Cow;

import model.Pig;

import model.Fox;

public class AnimalNoises {

	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.makeNoise());
		//created a new instance of the object and output the sound it makes
		Platypus frank = new Platypus();
		System.out.println(frank.makeNoise());
		Dog Titan = new Dog();
		System.out.println(Titan.makeNoise());

		Cat jordan = new Cat("Jordan",6,true);
		System.out.println(jordan.getName() + " Age: " + jordan.getAge() + " Is Loved: " + jordan.getIsLoved());
		System.out.println(jordan.getName() + ": " + jordan.speak());

		
		Pig Wilbur = new Pig();
		System.out.println(Wilbur.makeNoise());
		


		
		Penguin bob = new Penguin();
		System.out.println(bob.speak());

		
		Pig Pinky = new Pig();
		System.out.println(Pinky.makeNoise());




		// use non-default constructor Cow(String name, String type, int age, boolean breedStock)
		// to create an instance/object of Cow class
		Cow betsy = new Cow("Betsy", "dairy", 3, true);
		// call speak() method from Cow class to output sound it makes
		System.out.println(betsy.speak());


		//Abby Boggs 1.13.23 - added wolf instance and noise
		Wolf redd = new Wolf("Redd", "forest", "red");
		System.out.println(redd.makeNoise());



		Fox fantasticMr = new Fox();
		System.out.println("Fastastic Mr Fox says: " + fantasticMr.makeNoise());

	}

		//Rosie the Elephant
		Elephant rosie = new Elephant();
		System.out.println("The elephant says \"" + rosie.speak());

		Siamang monk = new Siamang();
		System.out.println(monk.makeNoise());

	}
}
