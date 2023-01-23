/**
 * @author ${Austin Mays} - ajmays@dmacc.edu
 * CIS175 - Spring 2023
 * ${01/17/2023}
 */

package model;

public class PolarBear {
	private String enclosure;
	private String animalName;
	private int numPenguins;
	
	public PolarBear() {
		super();
	}
	
	public PolarBear(String enclose, String name, int num ) {
		super();
		this.enclosure = enclose;
		this.animalName = name;
		this.numPenguins = num;
	}
	public String getEnclosure() {
		return enclosure;
	}
	public void setEnclosure(String enclosure) {
		this.enclosure = enclosure;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public int getNumBears() {
		return numPenguins;
	}
	public void setNumBears(int numPenguins) {
		this.numPenguins = numPenguins;
	}
	
	public String toString() {
		return "Name: " + animalName + " Enclosure: " + enclosure + " Number of Polar Bears: " + numPenguins;
	}
	public String speak() {
		return "Roar, growl";
	}
}
