/* 
 * Copyright (c) 2022 Rafael Galvan
 */
public class War {

	public static void main(String[] args) {
		Deck myDeck = new Deck();
	//	System.out.println(myDeck);

		myDeck.shuffle();
		System.out.println(myDeck);
		
		myDeck.selectionSort();
		System.out.println(myDeck);
		
		myDeck.shuffle();
		System.out.println(myDeck);
		
		myDeck.recursiveSort();
	//	System.out.println();
		
		

		Pile player1 = new Pile();
		Pile player2 = new Pile();

		Deck subDeck1 = myDeck.subDeck(0, 25);
		Deck subDeck2 = myDeck.subDeck(26, 51);

		player1.addDeck(subDeck1);
		player2.addDeck(subDeck2);

		Pile middlePile = new Pile();
		

		while (!player1.isEmpty() && !player2.isEmpty()) {
			
			Card c1 = player1.popCard();
			Card c2 = player2.popCard();
			
			middlePile.addCard(c1);
			middlePile.addCard(c2);
			System.out.println(c1);
			System.out.println(c2);

			int result = c1.compareTo(c2);
			if (result > 0) {
				for (Card card : middlePile.getCards()) {
					player1.addCard(card);
					middlePile.getCards().remove(card);
					/*
					  player1.addCard(c1); player1.addCard(c2); player1.addToPile(middlePile);
					 */
				}
				middlePile.getCards().clear();
			} else if (result < 0) {
				for (Card card : middlePile.getCards()) {
					player2.addCard(card);
					middlePile.getCards().remove(card);
					/*
					  player2.addCard(c1); player2.addCard(c2); player2.addToPile(middlePile);
					 */
				}
				middlePile.getCards().clear();
			} else {
				middlePile.addCard(c1);
				middlePile.addCard(c2);
			}
		}

		if (player2.isEmpty()) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Player 2 wins!");
		}

	}
}
