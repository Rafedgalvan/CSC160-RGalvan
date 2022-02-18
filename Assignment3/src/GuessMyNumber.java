import java.util.Random;
import java.util.Scanner; 



public class GuessMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		Scanner in = new Scanner(System.in);
		int userNumber; 
		
		
		System.out.println("I'm thinking of a number between 1 and 100, (including both). Can you guess what it is?");
		System.out.println("Type your number: ");
		userNumber = in.nextInt();
		System.out.println("Your guess: " + userNumber);
		System.out.println("My number is: " + number);
		System.out.println("You were off by " + (userNumber - number ));
		// I can't figure out how to make it positive 


	}
	
	

}
