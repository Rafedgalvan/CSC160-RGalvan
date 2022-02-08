import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		String Double;
		Scanner in = new Scanner(System.in);
		
		// TODO Auto-generated method stub

		double celcius;
		double fahrenheit; 
		
		System.out.print("Type fahrenheit value:");
		fahrenheit = in.nextDouble();
		celcius = (5.0 / 9.0 * (fahrenheit - 32)); 
		System.out.println(celcius);
		
		
		System.out.print("Type celcius value:");
		celcius = in.nextDouble();
		fahrenheit = ((celcius * 9.0 / 5.0) +32);
		System.out.println(fahrenheit);
		
		
	}

}
