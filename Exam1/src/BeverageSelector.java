import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int userNumber;
		System.out.println("Please select your beverage.");
		System.out.println("Input 1 for water.");
		System.out.println("Input 2 for coke.");
		System.out.println("Input 3 for coffee.");
		System.out.println("Input your number: ");
		userNumber = in.nextInt();

		if (userNumber == 1) {
			System.out.println("You have selected water.");
		} else if (userNumber == 2) {
			System.out.println("You have selected coke.");
		} else if (userNumber == 3) {
			System.out.println("You have selected coffee.");
		} else {
			System.out.println("Please input a valid number. ");
		}

	}

}
