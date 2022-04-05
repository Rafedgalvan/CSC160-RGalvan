import java.util.Objects;

public class Car extends Vehicle{
	private String trim;
	

	public Car(String vinNumber, int minSpeed, int maxSpeed, String trim) {
		super(vinNumber, minSpeed, maxSpeed);
		this.trim = trim;
	
	}


	public String getTrim() {
		return trim;
	}


	public void setTrim(String trim) {
		this.trim = trim;
	}
	
	public int drive(int miles, int fuel){
		super.drive(miles);
		int currentFuel = fuel - miles;
		System.out.println(fuel - miles);
		return currentFuel;
	}


	@Override
	public int hashCode() {
		return Objects.hash(trim);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(trim, other.trim);
	}


	@Override
	public String toString() {
		return "Car [trim: " + trim + " vinNumber: " + super.getVinNumber() + " minSpeed: " + super.getMinSpeed() + " maxSpeed: " + super.getMaxSpeed() + "]";
	}
	
	
	
}
