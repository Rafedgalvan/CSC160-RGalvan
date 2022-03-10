import java.util.Scanner;

public class Doubloon {

	public static void main(String[] args) {
		
	isDoubloon("abba");
	
		

	}
	public static void isDoubloon(String s) {
		String r=s.toLowercase();
		int count = 0;
		int i = 0;
		
		while(i < r.length()-1) {
			
			i++;
			int j = i+1;
			
			while( j < r.length()-1) {
				if(r.charAt(i)==r.charAt(j)) count++;
				j++;
			}
			
		}
		if(count%2==0) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
	}

}
