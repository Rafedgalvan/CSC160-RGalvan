
public class Truck extends Vehicle {
	private int bedLength;
	
	

	public Truck(String vinNumber, int minSpeed, int maxSpeed, int bedLength) {
		super(vinNumber, minSpeed, maxSpeed);
		this.bedLength = bedLength;
	}


	public int getBedLength() {
		return bedLength;
	}

	public void setBedLength(int bedLength) {
		this.bedLength = bedLength;
	}

	@Override
	public String toString() {
		return "Truck [bedLength=" + bedLength + " vinNumber: " + super.getVinNumber() + " minSpeed: " + super.getMinSpeed() + " maxSpeed: " + super.getMaxSpeed() + "]";
	}
	
	
	
	

}
