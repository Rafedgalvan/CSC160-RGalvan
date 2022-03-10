
public class FindValue {

	public static void main(String[] args) {
	
		int[] a = { 1, 2, 3, 4};
		int i;
		boolean result = findValue(a, 4);
		if (result) {
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}

	}

	public static boolean findValue (int a[], int value) {
		for(int i = 0; i < a.length; i++) { 
			if(value == a[i]) {
				return true;
			}
			
		} 
		return false;
	}

}

