package model;

/**
 * @author Riley Ahlrichs riahl - rpahlrichs
 * CIS175 - Spring 2023
 * Jan 14, 2023
 */

public class Pig {
	private String name;
	private String breed;
	private int weight;
	
	
	public Pig() {
		super();
	}
	
	/**
	 * @param name
	 * @param breed
	 * @param weight
	 */
	public Pig(String name, String breed, int weight) {
		super();
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name void set name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * @param breed void set breed
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/**
	 * @return weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight void set weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Pig [name=" + name + ", breed=" + breed + ", weight=" + weight + "]";
	}
	
	public String makeNoise() {
		return "Oink! Oink!";
	}
	
	
}
