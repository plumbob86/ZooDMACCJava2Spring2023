//Max Chance
//1/27/2023
//Created class rat

package model;

public class Rat {
    
	
	private String name;
	private int age;
	
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
	
	public Rat() {
		setName("Master Splinter");
		setAge(50);
	}
	
	public Rat(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public String speak(){
		return "Squeek Squeek";
	}
}