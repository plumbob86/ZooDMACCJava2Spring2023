import model.Dog;
import model.Example;

public class AnimalNoises {
	
	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.makeNoise());
		Dog Titan = new Dog();
		System.out.println(Titan.makeNoise());
	}

}
