/**
 * Michael Van Riessen - mjvanriessen
 * CIS175 - Spring 2023
 * Jan 17, 2023
 */
package model;


public class Tiger {
	
	private double weight;
	private String scientificName;
	private int ageYears;
	
	public Tiger() {
		
	}
	
	public Tiger(double weight, String scientificName, int ageYears) {
		this.weight = weight;
		this.scientificName = scientificName;
		this.ageYears = ageYears;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getScientificName() {
		return scientificName;
	}

	public int getAgeYears() {
		return ageYears;
	}

	public void setAgeYears(int ageYears) {
		this.ageYears = ageYears;
	}
	
	public String speak() {
		return "ROAR!";
	}
	
	

}
