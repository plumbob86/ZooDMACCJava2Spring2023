/**
 * @author Adell - amrogers5
 * CIS175 - Spring 2023
 * Jan 16, 2023
 */
package model;


public class Phoenix {
	//Three properties
	private String name;
	private int numIncarnations;
	private boolean isMythical;
	
	//Constructors
	public Phoenix() {
		super();
	}
	
	public Phoenix(String name, int numIncarnations, boolean isMythical) {
		super();
		this.name = name;
		this.numIncarnations = numIncarnations;
		this.isMythical = isMythical;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	
	public int getNumIncarnations() {
		return numIncarnations;
	}
	
	public boolean getIsMythical() {
		return isMythical;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumIncarnations(int numIncarnations) {
		this.numIncarnations = numIncarnations;
	}
	
	public void setIsMythical(boolean isMythical) {
		this.isMythical = isMythical;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Phoenix [name=" + name + ", Incarnations=" + numIncarnations + "lives, Is Mythical=" + isMythical + "]";
	}
	
	public String makeNoise() {
		return "Objection!";  //Sorry, I couldn't resist an Ace Attorney: Phoenix Wright reference!
	}
}
