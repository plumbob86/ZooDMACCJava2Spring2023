package model;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Jan 17, 2023
 */
public class GuineaPig {
	private String name;
	private String color;
	private int age;
	/**
	 * @param habitat
	 * @param name
	 * @param length
	 */
	
	public GuineaPig() {
		
	}
	
	public GuineaPig(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	// get the name
	public String getName() {
		return name;
	}

	// set the name
	public void setName(String name) {
		this.name = name;
	}

	// get the color
	public String getColor() {
		return color;
	}

	// set the color
	public void setColor(String color) {
		this.color = color;
	}

	// get the age
	public int getAge() {
		return age;
	}

	// set the age
	public void setAge(int age) {
		this.age = age;
	}
	
	public String makeNoise() {
		return "Squeak squeak!!";
	}

	@Override
	public String toString() {
		return "GuineaPig [name=" + name + ", color=" + color + ", age=" + age + "]";
	}	
}
