package model;

public class Sloth {
	//sloth class
	//Member variables
	private String name;
	private int age;
	private int toes; // two toed or three toed sloth?
	private String species; //species of sloth
	
	//Getters and setters
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
	public int getToes() {
		return toes;
	}
	public void setToes(int toes) {
		this.toes = toes;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	//Constructors
	public Sloth()
	{
		super();
	}
	public Sloth(String name, int age, int toes, String species) {
		setName(name);
		setAge(age);
		setToes(toes);
		setSpecies(species);
	}
	
	public String speak(){
		//the sounds sloths(sort of) make - https://www.youtube.com/watch?v=5Tdokh1KYuQ
		return "AY AY AY AY";
	}
}