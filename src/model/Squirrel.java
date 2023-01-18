package model;

/**
 * @author Christopher Howarth - 901027686
 * CIS175 - Fall 2021
 * Jan 17, 2023
 */
public class Squirrel {
	private int weight;
	private int size;
	private String habitat;
	
	public Squirrel() {
		super();
		
	}
	
	/**
	 * @param weight
	 * @param size
	 * @param habitat
	 */
	public Squirrel(int weight, int size, String habitat) {
		super();
		this.weight = weight;
		this.size = size;
		this.habitat = habitat;
	}
	
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
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
	
	public String toString() {
		return "Squirrel [size=" + size + ", weight=" + ", habitat=" + habitat + "]";
	}
	
	public String makeNoise() {
		return "Chit, chit, chit, chchchchchchit!";
	}

}
