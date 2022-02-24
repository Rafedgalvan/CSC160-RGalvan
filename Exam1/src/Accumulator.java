import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNumber;
		System.out.println("Input your number: ");
		userNumber = in.nextInt();

		int sum = 0;

		while (userNumber != 0) {

			sum = sum + userNumber;
			System.out.println("Current Sum: " + sum);
			System.out.println("Input your number again: ");
			userNumber = in.nextInt();
		}
		System.out.println("The sum is:" + sum);

	}

}
