
public class Car {
	// Data Members
	private String color;
	private double amountOfGas;
	private int milleage; 
	
	//Constructors 
	public Car() {
		color = "Grey";
		amountOfGas = 10.0;
		milleage = 10;
	}
	
	public Car(String color) {
		this.color = color;
	}

	public Car(String color, double amountOfGas, int milleage) {
		super();
		this.color = color;
		this.amountOfGas = amountOfGas;
		this.milleage = milleage;
	}

	//Getters and Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAmountOfGas() {
		return amountOfGas;
	}

	public void setAmountOfGas(double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}

	public int getMilleage() {
		return milleage;
	}

	public void setMilleage(int milleage) {
		this.milleage = milleage;
	}
	
	
	//Methods
	public void selfClean()
	{
		System.out.println("Clean car!!");
	}
	
	public static void washCar(Car dirtyCar)
	{
		System.out.println("Car color:" + dirtyCar.color);
		
		System.out.println("Clean car");
	}
}
	
	
