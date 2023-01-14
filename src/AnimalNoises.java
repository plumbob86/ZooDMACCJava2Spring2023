//added semicolon to the end of import (Andrew Steele 01/10/2023)
//had to add semicolon to the end of import model.Example for program to run (Riley Ahlrichs 1/14/2023)
import model.Example;
import model.Platypus;

import model.Dog;
import model.Example;
import model.Example;
import model.Cat;
import model.Pig;
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
		
		Pig Pinky = new Pig();
		System.out.println(Pinky.makeNoise());
	}

}
