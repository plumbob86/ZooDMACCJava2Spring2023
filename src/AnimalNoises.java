/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Jan 17, 2023
 */

import model.Platypus;
import model.Dog;
import model.Cat;
import model.GuineaPig;

public class AnimalNoises {
	
	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {
		
		Platypus frank = new Platypus();
		System.out.println(frank.makeNoise());
		Dog Titan = new Dog();
		System.out.println(Titan.makeNoise());
		Cat jordan = new Cat("Jordan",6,true);
		System.out.println(jordan.getName() + " Age: " + jordan.getAge() + " Is Loved: " + jordan.getIsLoved());
		System.out.println(jordan.getName() + ": " + jordan.speak());
		
		// create GuineaPig object and print results of makeNoise method
		GuineaPig daisy = new GuineaPig();
		System.out.println(daisy.makeNoise());
	}
}

