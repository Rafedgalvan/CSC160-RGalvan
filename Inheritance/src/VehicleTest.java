
public class VehicleTest {

	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle("ss", 1, 100);
		
		System.out.println(myVehicle);
		myVehicle.drive(10);
		
		Car myCar = new Car("ss", 1, 400, "b");
		
		System.out.println(myCar);
		
		int fuel = myCar.drive(4, 7); // miles - fuel is the order
		
	/*	Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Car("JJ4", 0, 100, "Sedan");
		//vehicles[1] = new Car("RR5", 0, 150, "Sports");
		//vehicles[2] = new Car("SS6", 0, 120, "Motorcylce");
		
		for(int i = 0; i < vehicles.length; i++) {
			System.out.println(vehicles[i]);
			}*/

		
		Vehicle[] vehicles2 = new Vehicle[3];
		
		vehicles2[0] = new Vehicle("JJ4", 0, 100);
		vehicles2[1] = new Car("RR5", 0, 150, "Sports");
		vehicles2[2] = new Truck("RR5", 0, 150, 5);
		
		for(int i = 0; i < vehicles2.length; i++) {
			System.out.println(vehicles2[i]);
			}
		
	}

}
