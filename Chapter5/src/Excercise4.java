import java.util.Scanner;

public class Excercise4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int userNumber;
		System.out.println("Input your number between 1 & 7: ");
		userNumber = in.nextInt();
		String newString = analyzeDay(userNumber);
		System.out.println(newString);
	}

	public static String analyzeDay(int userNumber) {
		String myString = null;
		if (userNumber == 1) {
			myString = "Monday";
		} else if (userNumber == 2) {
			myString = "Tuesday";
		} else if (userNumber == 3) {
			myString = "Wednesday";
		} else if (userNumber == 4) {
			myString = "Thursday";
		} else if (userNumber == 5) {
			myString = "Friday";
		} else if (userNumber == 6) {
			myString = "Saturday";
		} else if (userNumber == 7) {
			myString = "Sunday";
		}

		return myString;

	}

}
