/**
 * @author ${Austin Mays} - ajmays@dmacc.edu
 * CIS175 - Spring 2023
 * ${01/17/2023}
 */

package model;

public class Penguin {
	private String enclosure;
	private String animalName;
	private int numPenguins;
	
	public Penguin() {
		super();
	}
	
	public Penguin(String enclose, String name, int num ) {
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
	public int getNumPenguins() {
		return numPenguins;
	}
	public void setNumPenguins(int numPenguins) {
		this.numPenguins = numPenguins;
	}
	
	public String toString() {
		return "Name of Penguin: " + animalName + " Enclosure: " + enclosure + " Number of Penguins: " + numPenguins;
	}
	public String speak() {
		return "Awrf, squak, wee!";
	}
}
