import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Random random = new Random();
		int number = random.nextInt(10, 21);
		Scanner in = new Scanner(System.in);
		int userNumber = 0;
		int points = 6;
		

		System.out.println("I'm thinking of a number between 10 and 20, (including both). Can you guess what it is?");
		System.out.println("Type your number: ");
		while(userNumber != number) {
			points = points - 1;
			if(points == -1) {
				points = points + 1;
			}
			userNumber = in.nextInt();
			if (userNumber < number) {
				System.out.println("Too low");
				
			} else if (userNumber > number) {
				System.out.println("Too high");
				
			}

			else if (userNumber == number) {
				System.out.println("Got it!");
				System.out.println("Points: " + points);
				break;
				
			}
			System.out.println("Your guess: " + userNumber);
			System.out.println("Points: " + points);

		}

	}
}
