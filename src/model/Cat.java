/**
 * 
 */
package model;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Jan 9, 2023
 */
public class Cat {
	private String habitat;
	private String name;
	private int length;
	/**
	 * @param habitat
	 * @param name
	 * @param length
	 */
	
	public Cat() {
		
	}
	
	public Cat(String habitat, String name, int length) {
		super();
		this.habitat = habitat;
		this.name = name;
		this.length = length;
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
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	public String makeNoise() {
		return "Meow";
	}

	@Override
	public String toString() {
		return "Cat [habitat=" + habitat + ", name=" + name + ", length=" + length + "]";
	}
	
}
