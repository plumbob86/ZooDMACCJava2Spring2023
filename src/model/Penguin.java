package model;

/**
 * @author Allen Tong - awtong
 * CIS175 - Spring 2023
 * Jan 16, 2023
 */

public class Penguin {
	
	private String name;
	private String species;
	private long height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public long getHeight() {
		return height;
	}
	public void setHeight(long height) {
		this.height = height;
	}
	
	public String speak() {
		return "SQUAWWK";
	}
	
	/**
	 * Default constructor
	 */
	public Penguin() {
		this.name = "Penguin";
		this.species = "Chinstrap";
		this.height = 70;
	}
	
	/**
	 * Non-default constructor.
	 * @param name - the penguin's name
	 * @param species - the penguin's species
	 * @param height - the penguin's height
	 */
	public Penguin(String name, String species, long height) {
		this.name = name;
		this.species = species;
		this.height = height;
	}
	
}
