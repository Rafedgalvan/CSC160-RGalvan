
public class LogicKnowledge {

	public static void main(String[] args) {
		

	}
	
	public int greenTicket(int a, int b, int c){
		if(a == b && a == c) {
			return 20;
		} 
		else if(a == b && a != c || a != b && a == c || b == c) {
			return 10;
		}
		return 0;
	}

}
