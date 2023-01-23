/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Jan 13, 2023
 */
package model;

public class Elephant {
	private int trunkLength;
	private int tuskLength;
	private String color;
	
	/**
	 * 
	 */
	public Elephant() {
		super();
	}

	/**
	 * @param trunkLength
	 * @param tuskLength
	 * @param color
	 */
	public Elephant(int trunkLength, int tuskLength, String color) {
		super();
		setTrunkLength(trunkLength);
		setTuskLength(tuskLength);
		setColor(color);
	}

	/**
	 * @return the trunkLength
	 */
	public int getTrunkLength() {
		return trunkLength;
	}

	/**
	 * @param trunkLength the trunkLength to set
	 */
	public void setTrunkLength(int trunkLength) {
		this.trunkLength = trunkLength;
	}

	/**
	 * @return the tuskLength
	 */
	public int getTuskLength() {
		return tuskLength;
	}

	/**
	 * @param tuskLength the tuskLength to set
	 */
	public void setTuskLength(int tuskLength) {
		this.tuskLength = tuskLength;
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

	@Override
	public String toString() {
		return "Elephant [trunkLength=" + trunkLength + ", tuskLength=" + tuskLength + ", color=" + color + "]";
	}

	public String speak(){
		return "bahruuuuuuhhhhaaaaa";
	}
	
}
