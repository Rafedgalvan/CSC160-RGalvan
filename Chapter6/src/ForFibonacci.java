import java.util.Scanner;

public class ForFibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNumber;
		System.out.println("Input your number: ");
		userNumber = in.nextInt();

		int number1 = 0;
		int number2 = 1;
		int currentNumber = 0;
		
		if(userNumber == 1) {
			System.out.println(number1);
		}
		else {
			System.out.print(number1 + " ");
			System.out.print(number2 + " ");
		}

		for (int i = 3; i <= userNumber; i++) {
			currentNumber = number1 + number2;

			System.out.print(currentNumber + " ");
			number1 = number2;
			number2 = currentNumber;

		}

	}
}
