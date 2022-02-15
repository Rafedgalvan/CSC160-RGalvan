import java.util.Scanner;

public class Excercise3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int userNumber;
		System.out.println("Input your number: ");
		userNumber = in.nextInt();
		boolean result = isPositive(userNumber);
		if (result)
		{
			System.out.println("The number is positive");
		}
		else
		{
			System.out.println("The number is negative");
		}
	}
		
		
		public static boolean isPositive(int userNumber)
		{
			if(userNumber >= 0)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
			
			
		

	}


