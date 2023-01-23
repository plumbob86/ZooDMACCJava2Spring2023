/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Jan 13, 2023
 */
package model;

public class Wolf {
	//declare variables
	private String name;
	private String habitat;
	private String color;
	
	//default constructor
	public Wolf(){
		super();
	}
	
	//constructor with parameters
	public Wolf(String name, String habitat, String color) {
		super();
		this.name = name;
		this.habitat = habitat;
		this.color = color;
	}
	
	
	//getters and setters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the habitat
	 */
	public String getHabitat() {
		return habitat;
	}

	/**
	 * @param habitat the habitat to set
	 */
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setWeight(String color) {
		this.color = color;
	}

	//to string
	@Override
	public String toString() {
		return "Wolf [name=" + name + ", habitat=" + habitat + ", color=" + color + "]";
	}

	//make noise method
	public String makeNoise() {
		return "Awooooooo";
	}
}
