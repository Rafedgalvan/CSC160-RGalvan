import java.util.Scanner;

public class RightAngleLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNumber;
		System.out.println("Input your number of rows: ");
		userNumber = in.nextInt();
		for (int i = 1; i <= userNumber; i++) {
			for(int x = 1; x<= i; x++) {
				System.out.print(x);
			}
			System.out.println(" ");
			// I know you wanted this done in a method but I couldn't figure out how 
		}

	}
	
	
}
