package model;

/**  
* Jonathan Argueta-Herrera - jiarguetaherrera  
* CIS175 Spring 2023
* Jan 17, 2023  
*/

public class Turtle {
	
	private String habitat; 
	private String name;
	private int age;
	
	public Turtle(String h, String n, int a) {
		setHabitat(h);
		setName(n);
		setAge(a);
	}
	
	public String speak() {
		return "Woaaaah dude...";
	}
	
	
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Turtle [habitat=" + habitat + ", name=" + name + ", age=" + age + "]";
	} 
	
	

}
