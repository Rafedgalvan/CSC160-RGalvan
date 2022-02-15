import java.util.Scanner;

public class Excercise2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		System.out.println("Input the first number: ");
		number1 = in.nextInt();
		System.out.println("Input the second number: ");
		number2 = in.nextInt();
		System.out.println("Input the third number: ");
		number3 = in.nextInt();
		int myNum = greatestNumber(number1, number2, number3 );
		System.out.println("The greatest number is: " + myNum); 
	}

	public static int greatestNumber(int number1, int number2, int number3)
	{
			if (number1 > number2 && number1 > number3)
			{
				return number1;
			}
			else if (number2 > number1 && number2 > number3)
			{
				return number2;
			}
			else if(number3 > number1 && number3 > number2)
			{
				return number3;
			}
			else
			{
				return number1;
			}
	}
		
	

}
