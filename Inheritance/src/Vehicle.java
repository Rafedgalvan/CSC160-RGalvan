
public class Vehicle {
	
	private String vinNumber;
	private int minSpeed;
	private int maxSpeed;
	
	
	//getters and setters
	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public int getMinSpeed() {
		return minSpeed;
	}

	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	//constructors 
	public Vehicle(String vinNumber, int minSpeed, int maxSpeed) {
		super();
		this.vinNumber = vinNumber;
		this.minSpeed = minSpeed;
		this.maxSpeed = maxSpeed;
	}
	
	public Vehicle(String vinNumber) {
		this.vinNumber = vinNumber;  
	}
	
	public void drive(int miles) {
		for(int i = 0; i < miles; i++) {
		 System.out.print("+");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Vehicle [vinNumber: " + vinNumber + ", minSpeed: " + minSpeed + ", maxSpeed: " + maxSpeed + "]";
	}
	
	
	

}
