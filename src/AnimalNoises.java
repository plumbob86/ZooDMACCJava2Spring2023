//added semicolon to the end of import (Andrew Steele 01/10/2023)
import model.*;
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
		
		Siamang monk = new Siamang();
		System.out.println(monk.makeNoise());
		
		//New Animal - Turtle from Nemo movie
		Turtle Crush = new Turtle("East Austrailian Current (EAC)", "Crush", 150);
		System.out.println(Crush.speak());
	}
}
