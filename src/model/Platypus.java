package model;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Jan 10, 2023
 */
public class Platypus {
	//create instance variables
	private String name;
	private double weight;
	private String species;
	//constructors both default and with parameters
	public Platypus()
	{
		super();
	}
	public Platypus(String name, double weight, String species) {
		super();
		this.name = name;
		this.weight = weight;
		this.species = species;
	}
	/*
	 * @String return name
	 */
	public String getName() {
		return name;
	}
	/*
	 * @ void set the name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * @double return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/*
	 * @void set the weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/*
	 * @String return the species
	 */
	public String getSpecies() {
		return species;
	}
	/*
	 * @void set the species 
	 */
	public void setSpecies(String species) {
		this.species = species;
	}
	/*
	 * @Override returns the data of the object
	 * I added this because it was in the example POJO
	 */
	@Override
	public String toString() {
		return "Platypus [name=" + name + ", weight=" + weight + ", species=" + species + "]";
	}
	/*
	 * @String return the sound a platypus makes
	 * I tried to write the sound as close as I could 
	 * https://alphabetimals.com/animal-dictionary/animals-that-start-with-p/platypus/
	 * above is a link to the hear what they sound like :)
	 */
	public String makeNoise()
	{
		return "Rrrrrawt rrrrrrawt";
	}
}
