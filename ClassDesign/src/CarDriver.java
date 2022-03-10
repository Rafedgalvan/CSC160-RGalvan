
public class CarDriver {

	public static void main(String[] args) {
		Car myCar = new Car("Pink");
		myCar.setColor("Titanium");
		System.out.println("Car color is " + myCar.getColor()); 
		myCar.selfClean();
		Car.washCar(myCar);
		Car newCar = new Car("Green", 12.0, 0);

	}

}
