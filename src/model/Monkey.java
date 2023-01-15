/**
 *@author Uday F Chinhamora- ufchinhamora
 *CIS175 -Spring 2023
 *Jan 15, 2023
*/
package model;


public class Monkey {
	private String habitat;
	private String name;
	private int length;
	/**
	 * @param habitat
	 * @param name
	 * @param length
	 */
	
	public Monkey() {
		
	}
	
	public Monkey(String habitat, String name, int length) {
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
		return "hoot, scream, howl, coo, rumble, bark, pant, grunt";
	}

	@Override
	public String toString() {
		return "Monkey [habitat=" + habitat + ", name=" + name + ", length=" + length + "]";
	}
	
}


