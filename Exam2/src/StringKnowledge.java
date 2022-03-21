
public class StringKnowledge {

	public static void main(String[] args) {
		
	}
	
	
	
	public String getSandwich(String str) {
		int first = 0;
		int last = 0;
		
		for(int i = str.length(); i >= 0; i--) {
			if(str.substring(i, i + 4).equals("bread")) {
				first = i;
			}
		}
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i, i + 4).equals("bread"))
				last = i;
			
		}
	if(first != 1 && last != -1) {
		return str.substring(first + 4, last);
		
	}
	return str;

}
	
public boolean endOther(String a, String b) {
	if(a.length() < b.length() ) {
		String check = a;
		a = b.toLowerCase();
		b = a.toLowerCase();
		
	}
	return a.substring(a.length() - b.length()).equals(b);
	}
}
