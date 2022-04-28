
public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Answer: " + fib(5));

	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		int product = fib(n - 1) + fib(n - 2);
		return product;
	}

}
