package model;

public class Horse {
	
	//instance variables
	private String name; 
	private int age; 
	private boolean lovesHay;
	
	
	//constructor with parameters
	public Horse(String name, int age, boolean lovesHay) {
		super();
		this.name = name;
		this.age = age;
		this.lovesHay = lovesHay;
	}
	

	//makeNoise method
	public String makeNoise() {
		return "Nayyy";
	}

	
	//getters and setters
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
	public boolean isLovesHay() {
		return lovesHay;
	}
	public void setLovesHay(boolean lovesHay) {
		this.lovesHay = lovesHay;
	}


	@Override
	public String toString() {
		return "Horse [name=" + name + ", age=" + age + ", lovesHay=" + lovesHay + "]";
	}
	
	
	

}
