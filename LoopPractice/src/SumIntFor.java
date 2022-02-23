import java.util.Scanner;

public class SumIntFor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNumber;
		System.out.println("Input your number: ");
		userNumber = in.nextInt();

		int sum = 0;

		for (int i = 1; i <= userNumber; i++) {

			sum = sum + i;
			System.out.print(i);
			if (i < userNumber ) {
				System.out.print(" + ");
			}

		}
		System.out.print(" = " + sum);

	}

}
