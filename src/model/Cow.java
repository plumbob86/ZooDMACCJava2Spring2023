/**
* @author Elizabeth McCurdy - emccurdy
* CIS 175 - Spring 2023
* Jan 14, 2023
*/
package model;


public class Cow {
	// instance variables
	private String name;
	private String type;
	private int age;
	private boolean breedStock;
	
	
	
	/**
	 * Default - no args constructor
	 */
	public Cow() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * Non-default constructor that takes all parameters
	 * @param name
	 * @param type
	 * @param age
	 * @param breedStock
	 */
	public Cow(String name, String type, int age, boolean breedStock) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.breedStock = breedStock;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the breedStock
	 */
	public boolean isBreedStock() {
		return breedStock;
	}


	/**
	 * @param breedStock the breedStock to set
	 */
	public void setBreedStock(boolean breedStock) {
		this.breedStock = breedStock;
	}


	@Override
	public String toString() {
		return "Cow [name=" + name + ", type=" + type + ", age=" + age + ", breedStock=" + breedStock + "]";
	}
	
	/**
	 * Method that return a string with sound a cow makes
	 */
	public String speak() {
		return "Moo";
	}
	

}
