import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {

		Die myDiceGame = new Die();
		Scanner in = new Scanner(System.in);

		int dieSides;
		int players;
		String player1Name;
		String player2Name;

		System.out.println("How many sides will be used?");
		dieSides = in.nextInt();

		System.out.println("How many players are playing?");
		players = in.nextInt();

		System.out.println("Player 1 name: ");
		in.nextLine();
		player1Name = in.nextLine();
		System.out.println("Player 2 name: ");
		player2Name = in.nextLine();

		Random random = new Random();
		int number1 = random.nextInt(1, dieSides + 1);
		int number2 = random.nextInt(1, dieSides + 1);

		System.out.println(player1Name + " rolled a :" + number1 + " on a " + dieSides + " sided die");
		System.out.println(player2Name + " rolled a :" + number2 + " on a " + dieSides + " sided die");
		decideWinner(number1, number2, player1Name, player2Name);

		ArrayList<Player> playerList = new ArrayList<Player>();
		Player player1 = new Player();
		Player player2 = new Player();

		playerList.add(player1);
		playerList.add(player2);

	}

	public static void decideWinner(int number1, int number2, String player1Name, String player2Name) {
		if (number1 > number2) {
			System.out.println(player1Name + " won the game");
		} else if (number1 < number2) {
			System.out.println(player2Name + " won the game");
		} else {
			System.out.println("Draw");
		}
	}
}
