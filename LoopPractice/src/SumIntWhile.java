import java.util.Scanner;

public class SumIntWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int userNumber;
		System.out.println("Input your number: ");
		userNumber = in.nextInt();

		int sum = 0;
		int i = 1;

		while (i <= userNumber) {

			sum = sum + i;
			System.out.print(i);
			if (i < userNumber) {
				System.out.print(" + ");
			}
			i++;

		}

		System.out.print(" = " + sum);

	}

}
