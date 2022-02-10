import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		String Double;
		Scanner in = new Scanner(System.in);

		double celsius;
		double fahrenheit; 
		System.out.print("Type fahrenheit value:");
		fahrenheit = in.nextDouble();
		celsius = calculateCelcius(fahrenheit);
		System.out.println(celsius);
		
		System.out.print("Type celsius value:");
		celsius = in.nextDouble();
		fahrenheit = calculateFahrenheit(celsius);
		System.out.println(fahrenheit);
		
	}

	public static double calculateCelcius(double fahrenheit) 
	{
		double celcius;
		celcius = (5.0 / 9.0 * (fahrenheit - 32)); 
		return celcius;
		
	}
	
	public static double calculateFahrenheit(double celsius) 
	{
		double fahrenheit;
		fahrenheit = ((celsius * 9.0 / 5.0) +32); 
		return fahrenheit;
		
	}
}

//	System.out.print("Type fahrenheit value:");
//fahrenheit = in.nextDouble();
//celcius = (5.0 / 9.0 * (fahrenheit - 32)); 
//	System.out.println(celcius);


//System.out.print("Type celcius value:");
//celcius = in.nextDouble();
//fahrenheit = ((celcius * 9.0 / 5.0) +32);
//System.out.println(fahrenheit);
