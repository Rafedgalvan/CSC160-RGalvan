/* 
 * Copyright (c) 2022 Rafael Galvan
 */

import java.util.Arrays;
import java.util.Random;

/** 
 * Makes the deck and provides methods for manipulating the deck.
 * 
 * @author Rafael Galvan
 *
 */

public class Deck {

	private Card[] cards;
	
	

	// getters & setters
	/**
	 *  gets the cards
	 * @return cards
	 */
	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	/**
	 * Populates the deck with ranks and suits, comes from card class
	 * 
	 */
	// constructors
	public Deck(Card[] cards) {
		super();
		this.cards = cards;
		cards = new Card[52];
	}
	


	public Deck() {
		
		cards = new Card[52];
		int index = 0;
		// suits
		for(int s = 0; s < 4; s++)
		{
			
			// ranks
			for (int r = 1; r < 14; r++) {
				Card card = new Card (r, s);
				cards[index] = card;
				index++;

			}
		}
		/**
		 * Provides the deck, comes from the card class which creates the cards
		 * 
		 */		
		
	}
	
	public Deck(int n) {
		this.cards = new Card[n];
	}

	@Override
	public String toString() {
		return  Arrays.toString(cards);
	}


	public int search(int rank, int suit) {
		for(int i = 0; i < cards.length; i++ ) {
			if(cards[i].equals(rank) && cards[i].equals(suit)) {
				return i;
			}
		}
		return -1;
	}
	
	
	/**
	 * This shuffles the deck 
	 * 
	 * 
	 * 
	 */
	public void shuffle() {
		Random random = new Random();

		int j;
		for(int i = 0; i < cards.length; i++) {
			j = random.nextInt(cards.length);
			Card tempCard = cards[i];
			cards[i] = cards[j];
			cards[j] = tempCard;
			
		}
		
	}

	/**
	 * 
	 * @param low, the minimum value(card) for the deck
	 * @param high, the maximum value(card) for the deck
	 * @return deck
	 */
	
	public Deck subDeck(int low, int high) {
		Deck deck = new Deck((high - low) + 1); 
		int count = 0; 
		for(int i = low; i <= high; i++) {
			deck.cards[count] = cards[i];
			count++;
			
		}
		return deck;
	}

	/**
	 * Sorts the shuffled deck using selection sort
	 */
	public void selectionSort() {
		for(int i = 0; i < cards.length ; i++) {
			int min_idx = i;
			
			for(int j = i+1; j < cards.length; j++) {
				if(cards[j].compareTo(cards[min_idx]) == -1)
					min_idx = j;
			}
			
			Card temp = cards[min_idx];
			cards[min_idx] = cards[i];
			cards[i] = temp;
	}
		
}
	/**
	 * Sorts the deck using recursive sort
	 */
	public void recursiveSort(){
		
		recursiveSelectionSort(cards, 0, cards.length - 1);
		
		System.out.println(Arrays.toString(cards));
	}

	/**
	 * This is used to help the main selection sort method
	 * @param cards
	 * @param low, finds the lowest value
	 * @param high, finds the highest value then the lowest one is swapped with the lowest 
	 */
	public void recursiveSelectionSort(Card[] cards, int low, int high) {
		
		if(low < high) {
			// find the smallest card and its index in cards[low ... high]
			int indexOfMin = low;
			Card minCard = cards[low];
			for (int i = low + 1; i <= high; i++) {
				if(cards[i].compareTo(minCard) < 0) {
					minCard = cards[i];
					indexOfMin = i;
				}
			}
			
			// swap the smallest in the deck[low ... high] with cards[low]
			cards[indexOfMin] = cards[low];
			cards[low] = minCard;
			// sort the remaining deck[low + 1 ... high]
			recursiveSelectionSort(cards, low + 1, high);
			
		}
	}
	
 /*public static void mergeSort(Deck deck) {
		
	}
	
	public static void mergeSortHelper(Card[] cards, int low, int high) {
		mergeSortHelper()
		
	}*/
}
//
