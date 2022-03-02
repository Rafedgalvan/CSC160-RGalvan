import java.util.Scanner;

public class IceCream2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNumber;
		System.out.println("How many students will be getting a single cone? ");
		userNumber = in.nextInt();
		int i = 0;
		double sum = 0;
		
		while(i < userNumber) {
			
			sum = sum + 5;
			i++;
		}
		sum = sum / 2.0 ;
		System.out.println("The total for each student $" + sum);

	}

}
