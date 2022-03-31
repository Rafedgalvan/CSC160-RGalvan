import java.util.Arrays;
import java.util.Random;

public class Deck {

	private Card[] cards;

	// getters & setters
	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

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

	
	public Deck subDeck(int low, int high) {
		Deck deck = new Deck((high - low) + 1); 
		int count = 0; 
		for(int i = low; i <= high; i++) {
			deck.cards[count] = cards[i];
			count++;
			
		}
		return deck;
	}
	
	
	
}
//
