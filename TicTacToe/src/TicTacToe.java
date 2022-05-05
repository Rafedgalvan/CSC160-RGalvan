
public class TicTacToe {

	public static void main(String[] args) {

		//showBoard();
		char[][] board = new char[3][3];
		 char ch = '1';
	        for (int i = 0; i < 3; i++){
	            for (int j = 0; j < 3; j++) {
	                board[i][j] = ch++;
	            }
	        }
		displayBoard(board);
	}

	public static void showBoard() {
		System.out.println("   " + "   |   " + "   |   ");
		System.out.println("   " + "   |   " + "   |   ");
		System.out.println("   " + "   |   " + "   |   ");
		System.out.println("--------------------");
		System.out.println("   " + "   |   " + "   |   ");
		System.out.println("   " + "   |   " + "   |   ");
		System.out.println("   " + "   |   " + "   |   ");
		System.out.println("--------------------");
		System.out.println("   " + "   |   " + "   |   ");
		System.out.println("   " + "   |   " + "   |   ");
		System.out.println("   " + "   |   " + "   |   ");
	}

	private static void displayBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (j == board[i].length - 1)
					System.out.print(board[i][j]);
				System.out.println("--------------------");}
				else {
					System.out.print("   " + board[i][j] + "   |    ");
				
			}
			
			System.out.println();
			

		}
	}
}
