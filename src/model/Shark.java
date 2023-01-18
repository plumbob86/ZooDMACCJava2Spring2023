/**
 * @author Lia Kruger - alkruger2
 * CIS175 - Spring 2023
 * Jan 16, 2023
 */
package model;

public class Shark {
	
	private String name;
	private int age;
	private String species;
	
	public Shark()
	{
		super();
	}
	public Shark(String name, int age, String species) {
		super();
		this.name = name;
		this.age = age;
		this.species = species;
		
	// Getters & Setters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	// To String
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Example [name=" + name + ", age=" + age + "years, species=" + species + "]";
	}
	
	// Animal Noise (I realized when I got to this point that sharks are incapable of producing sound...) 
	public String makeNoise() {
		return "*silence*";
	}
}