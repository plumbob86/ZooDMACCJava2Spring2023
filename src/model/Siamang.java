package model;

/**
 * @author Isaiah
 * CIS175 - Spring 2023
 * Jan 11, 2023
 */

public class Siamang {
	private String name;
	private String color;
	private String wingspan;
	
	public Siamang() {
		this.name = "Siamang";
		this.color = "Black";
		this.wingspan = "5ft";
	}
	
	public Siamang(String name, String color, String wingspan) {
		this.name = name;
		this.color = color;
		this.wingspan = wingspan;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getWingspan() {
		return wingspan;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setWingspan(String wingspan) {
		this.wingspan = wingspan;
	}
	
	public String makeNoise() {
		return "hmmmmmmmmmWOOOhmmmWOOOOOhmmWOOOOhmWOhmWOhmWOhmWOhmWOOOOOO";
	}
}
