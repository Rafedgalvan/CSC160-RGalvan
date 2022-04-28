import java.util.Arrays;

public class Array2D {
	
	public static void main(String[] args) { 
		
		int[][] myArray = makeTable();
		
		
		for(int i = 0; i < myArray.length; i++) {
			for(int j = 0; j < myArray[i].length; j++) {
				myArray[i][j] = (i + 1) * (j + 1);
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}
	private static int[][] table = new int[10][10];
	
	
	public static int[][] makeTable() {
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[i].length; j++) {
				table[i][j] = (i + 1) * (j + 1);
			}
		}
		return table;
	}

}
