package model;

public class Tiger {
	
	private String name;
	private int age;
	private int weight;
	
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Tiger() {
		setName("null");
		setAge(0);
		setWeight(0);
	}
	
	public Tiger(String name, int age, int weight) {
		setName(name);
		setAge(age);
		setWeight(weight);
	}
	
	public String speak(){
		return "Growl";
	}
}