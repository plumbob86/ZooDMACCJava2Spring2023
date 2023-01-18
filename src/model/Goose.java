package model;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Spring 2023
 * Jan 17, 2023
 */
public class Goose {
	private String name;
	private int weight ;
	private int age;

	public Goose() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goose(String name, int weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}

	public String speak() {
		return "Honk!";
	}



}
