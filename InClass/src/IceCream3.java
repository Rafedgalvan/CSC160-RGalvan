import java.util.Scanner;

public class IceCream3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNumber;
		System.out.println("How many students will be getting a cone? ");
		userNumber = in.nextInt();
		in.nextLine();
		double sum = 0;

		for (int i = 0; i < userNumber; i++) {
			
			System.out.println("Will you be getting a double cone? ");
			String answer;
			answer = in.nextLine();
			
			if (answer.toLowerCase().equals("y")) {
				sum = sum + 7;
			} 
			else {
				sum = sum + 5;
			}

		}
		System.out.println("The total for each student is $" + sum / 4);
	}

}
