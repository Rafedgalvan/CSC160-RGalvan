import java.util.Scanner;

public class Excercise3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float userNumber;
		System.out.println("Input your number: ");
		userNumber = in.nextFloat();
		String newString = analyzeFloat(userNumber);
		System.out.println(newString);
		
	}
		
		
		public static String analyzeFloat(float userNumber)
		{
			String myString = null;
			if(userNumber > 0)
			{
				myString = "Positive";
			}
			else if (userNumber < 0)
			{
				myString = "Negative";
			}
			else 
			{
				myString = "Zero";
			}
			
			if(userNumber > 1000000)
			{
				myString = myString + " & Large";
			}
			else if(userNumber < 1)
			{
				myString = myString + " & Small";
			}
			
			return myString;
		}
			
			
		

	}


