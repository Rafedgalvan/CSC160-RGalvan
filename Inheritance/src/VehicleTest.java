import java.util.Scanner;


public class VehicleTest {

	public static void main(String[] args) {
		
		int answer = Integer.parseInt("5");
		answer += 5;
		System.out.println(answer);
		
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
		((Truck)vehicles2[2]).getBedLength();
		
		Object myTruck = new Truck("RR5", 0, 150, 7);
		System.out.println(myTruck);
		
		((Truck)myTruck).setBedLength(9);
		System.out.println(myTruck);
		
		Vehicle truck = new Truck("RR5", 0, 150, 7);
		String Trim =((Car)myTruck).getTrim();
		
		Vehicle vech = null;
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		if(input == 1) {
			vech = new Car("RR5", 0, 150, "Sports");
		}
		else {
			vech = new Truck("RR5", 0, 150, 7);
		}
		if(vech instanceof Car) {
			Trim = ((Car)vech).getTrim();
		}
		
		System.out.println(vech);
		
		
		
	}

}
