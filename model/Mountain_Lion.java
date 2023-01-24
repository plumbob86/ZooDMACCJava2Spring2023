package model;

/**
 * @author Bradh 
 * CIS175 23290 Java II Spring 2023
 * Jan 17, 2023
 */

public class Mountain_Lion {
	
	private String name;
	private String habitat;
	private double wieght;
	
	public Mountain_Lion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mountain_Lion(String name, String habitat, double wieght) {
		super();
		this.name = name;
		this.habitat = habitat;
		this.wieght = wieght;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public double getWieght() {
		return wieght;
	}
	public void setWieght(double wieght) {
		this.wieght = wieght;
	}
	
	public String makeNoise() {
		return "Mountain lions can scream. It's genuenly terrifying. Youtube it.";
	}

	@Override
	public String toString() {
		return "Octopus [name=" + name + ", habitat=" + habitat + ", wieght=" + wieght + "]";
	}
}
