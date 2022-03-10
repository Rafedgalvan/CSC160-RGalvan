
public class CarDriver {

	public static void main(String[] args) {
		Car myCar = new Car("Pink");
		myCar.setColor("Titanium");
		System.out.println("Car color is " + myCar.getColor()); 
		myCar.selfClean();
		Car.washCar(myCar);
		Car newCar = new Car("Green", 12.0, 0);
		System.out.println("Car Color: " + myCar.getColor() + " Milaeage: " + myCar.getMilleage());
		System.out.println(newCar.toString());
		if(myCar.equals(newCar)) {
			System.out.println("Cars are the same");
		} else {
		System.out.println("Cars are the not the same");
		}
	}
}
