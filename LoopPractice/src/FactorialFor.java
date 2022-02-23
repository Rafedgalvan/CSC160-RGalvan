import java.util.Scanner;

public class FactorialFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int userNumber;
		System.out.println("Input your number: ");
		userNumber = in.nextInt();

		int sum = 1;

		for (int i = 1; i <= userNumber; i++) {

		
			sum = sum * i;
			System.out.print(i);
			if (i < userNumber) {
				System.out.print(" * ");
			}

		}

		System.out.print(" = " + sum);

	}

}
