
/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Jan 17, 2023
 */
package model;

public class Wolf {
	
	private String name; //type String represents the Wolf's name
	private String eyeColor; //type String represents the Wolf's eye color
	private int size; //type Integer represents the Wolf's body size or height

	//public default no-arg constructor
	public Wolf() {
		
	}
	
	//public non-default constructor w/ 3 parameters
	public Wolf(String wolfName, String wolfEyeColor, int wolfSize) {
		super();
		this.name = wolfName;
		this.eyeColor = wolfEyeColor;
		this.size = wolfSize;
	}

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
	 * @return the eyeColor
	 */
	public String getEyeColor() {
		return eyeColor;
	}

	/**
	 * @param eyeColor the eyeColor to set
	 */
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	//public method of return type String called 'speak()' returns the sound that the wolf makes
	public String speak() {
		return "Howl!";
	}

	@Override
	public String toString() {
		return "Wolf [name=" + name + ", eyeColor=" + eyeColor + ", size(in inches)=" + size + "]";
	}


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

