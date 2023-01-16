package model;

/**  
* @author nmich - nmichaud 
* CIS175 - Spring 2023
* Jan 16, 2023  
*/
public class Snake {
    private String name;
    private int length;
    private boolean isVenomous;
    
    public Snake() {
		super();
		// TODO Auto-generated constructor stub
    }
    
	public Snake(String name, int length, boolean isVenomous) {
		super();
		this.name = name;
		this.length = length;
		this.isVenomous = isVenomous;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean isVenomous() {
		return isVenomous;
	}
	public void setVenomous(boolean isVenomous) {
		this.isVenomous = isVenomous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", isVenomous=" + isVenomous + "]";
	}
    
    public static String makeNoise() {
    	return "ssssssssssssssss";
    }
}
