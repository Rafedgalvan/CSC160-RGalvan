import java.util.Random;

public class Die {

	private int numSides;
	private int value;
	
	public int getNumSides() {
		return numSides;
	}
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public Die(int numSides, int value) {
		super();
		this.numSides = numSides;
		this.value = value;
	}
	
	public Die() {
		numSides = 6;
		value = 1;
	}
	
	public Die(int numSides) {
		value = 1;
	}
		
	public void roll() {
		Random random = new Random();
		value = random.nextInt(1, 7);
	}
		
	
	@Override
	public String toString() {
		return "Number of Sides: " + numSides + "\n" + "Value: " + value;
	}
	
	
}
