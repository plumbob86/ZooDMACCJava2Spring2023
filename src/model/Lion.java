/**
 * @author chadrobbins - cerobbins@dmacc.edu
 * CIS 175 - Spring 2022
 * Jan 17, 2023
 */
package model;

/**
 * @author chadrobbins
 *
 */
public class Lion {
	//Instance variables
	String name;
	String weight;
	String color;
	
	//Constructors
	
	/**
	 * Default no-arg constructor
	 */
	public Lion() {	
		super();
	}
	
	 
	/**
	 * @param name
	 * @param weight
	 * @param color
	 */
	public Lion(String name, String weight, String color) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
	}

	//Getters and Setters
	
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
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
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
	public void setColor(String color) {
		this.color = color;
	}

	//toString() and String method
	
	@Override
	public String toString() {
		return "Lion [name=" + name + ", weight=" + weight + ", color=" + color + "]";
	}
	
	public String makeNoise() {
		return "ROAR!";
	}
	
	
}
