import java.util.Arrays;

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

	@Override
	public String toString() {
		return  Arrays.toString(cards);
	}
	
	public int search(int rank, int suit) {
		for(int i = 0; i < cards.length; i++ ) {
			if(cards[i].equals(suit)) {
				return i;
			}
		}
		return -1;
	}
	

}
