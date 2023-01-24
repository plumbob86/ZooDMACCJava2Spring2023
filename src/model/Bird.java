package model;

/**
 * @author nrgarrels 
 * CIS175 - Spring 2023
 * Jan 17, 2023
 */
public class Bird {
	private String type;
	private String name;
	private String color;

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bird(String type, String name, String color) {
		super();
		this.type = type;
		this.name = name;
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bird [name=" + name + ", type=" + type + ", color=" + color + "]";
	}
	public String makeNoise() {
		return "Chirp!";
	}
}