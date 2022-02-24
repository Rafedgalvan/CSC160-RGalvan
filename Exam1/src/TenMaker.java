
public class TenMaker {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 5;
		boolean result = makes10(num1, num2);
		if (result) {
			System.out.println("The numbers add up to 10.");
		} else {
			System.out.println("The numbers do not add up to 10.");
		}

	}

	public static boolean makes10(int num1, int num2) {
		if (num1 + num2 == 10) {
			return true;
		} else {
			return false;
		}
	}

}
