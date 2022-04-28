import java.util.Scanner;

public class SumIt {

	public static void main(String[] args) {
		sumIt();
		
	}
	
	public static int sumIt() {
		Scanner in = new Scanner(System.in);
		int userNumber;
		int sum = 0;
		System.out.println("Input your number: ");
		userNumber = in.nextInt();
		
		if(userNumber == 0) {
			return 1;
		}
		
		sum = userNumber + sumIt();
		System.out.println("Current Sum: " + sum);
		System.out.println("Input your number again: ");
		
		return sum;
		
		
	}
	
}

/*   
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
  
 */
 