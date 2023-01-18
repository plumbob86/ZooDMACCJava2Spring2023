package model;

/**
* @author Kevin Roney - karoney
* CIS 175 - Fall 2023
* Jan 17, 2023
*/
public class BaldEagle {
	//instancej variables
	private String name;
	private int age;
	private double wingspan;
	
	//constructors
	public BaldEagle() {
		this.name = "";
		this.age = 0;
		this.wingspan = 0;
	}
	public BaldEagle(String name, int age, double wingspan) {
		this.name = name;
		this.age = age;
		this.wingspan = wingspan;
	}
	
	//getters and setters
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWingspan() {
		return this.wingspan;
	}
	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}
	
	//override toString method
	@Override
	public String toString() {
		return "Bald Eagle [name=" + name + ", age=" + age + ", wingspan=" + wingspan + "]";
	}

	//call of a bald eagle is an extended chirp like call, i replicated as best I could with letters
	public String makeNoise()
	{
		return "SCREEeeEE! SCREEeeEE! SCREEeeEE!";
	}
}
