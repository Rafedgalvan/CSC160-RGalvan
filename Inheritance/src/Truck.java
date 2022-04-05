
public class Truck extends Vehicle {
	private int bedLength;

	public Truck(String vinNumber, int minSpeed, int maxSpeed, int bedLength) {
		super(vinNumber, minSpeed, maxSpeed);
		this.bedLength = bedLength;
	}
	

}
