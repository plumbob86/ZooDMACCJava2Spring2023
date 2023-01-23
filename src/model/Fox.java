package model;

/**
 * @author andrewmccoy - agmccoy
 * CIS175 - Fall 2021
 * Jan 14, 2023
 */
public class Fox {
	//properties
	private String latinName;
	private int numOfLegs;
	private int numOfEyes;	
	
	//constructors 
	public Fox() {
		
	}
	public Fox(String _latinName,
				int _numOfLegs,
				int _numOfEyes) {
		this.latinName = _latinName;
		this.numOfLegs = _numOfLegs;
		this.numOfEyes = _numOfEyes;		
	}
	
	//getters and setters
	public String getLatinName() {
		return this.latinName;
	}
	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
	
	public int getNumOfLegs() {
		return this.numOfLegs;
	}	
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	
	public int getNumOfEyes() {
		return this.numOfEyes;
	}	
	public void setNumOfEyes(int numOfEyes) {
		this.numOfEyes = numOfEyes;
	}	
	
	
	//Methods
	public String toString() {
		return "Fox [latin name = " + this.latinName + ", Number Of Legs = " + this.numOfLegs+ ", Number Of Eyes = "+ this.numOfEyes+"]";
	}
	public String makeNoise() {
		return "Ring-ding-ding-ding-dingeringeding";			
	}
	
	
	
	
	
	
	
	
	
}

	