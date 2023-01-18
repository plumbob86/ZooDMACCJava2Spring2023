package model;

/**
 * @author jacoby - jking11@dmacc.edu
 * CIS175 - Spring 2023
 * Jan 17, 2023
 */
public class Cow {
	private String habitat;
	private String name;
	private int age;
	/**
	 * 
	 */
	public Cow() {
		super();
	}
	/**
	 * @param habitat
	 * @param name
	 * @param age
	 */
	public Cow(String habitat, String name, int age) {
		super();
		this.habitat = habitat;
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Cow [habitat=" + habitat + ", name=" + name + ", age=" + age + "]";
	}
	public String makeNoise() {
		return "Moo!";
	}
}
