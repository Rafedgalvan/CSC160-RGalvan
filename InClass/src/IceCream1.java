import java.util.Scanner;

public class IceCream1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer;
		System.out.println("Did you purchase a single cone? ");
		System.out.println("Press Y if you did. Press N if you did not. ");
		answer = in.nextLine();
		
		int sum = 0;
		
		if (answer.toLowerCase().equals("y")) {
			sum = sum + 5;
			System.out.println("Your sum is $" + sum );
		}
		else {
			
			System.out.println("Your sum is $" + sum );
		}

		
		
		

	}

}
