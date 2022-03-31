import java.util.ArrayList;


public class Pile {
	ArrayList <Card> cards;
	
	public Pile() {
		cards = new ArrayList<Card>();
	}
	
	public Card popCard() {
		return cards.remove(0);
	}
	
	public void addCard(Card card) {
		cards.add(card);
		
		
	}
	
	public boolean isEmpty() {
		return cards.isEmpty();
	}
	
	public void addDeck(Deck deck) {
		
		for(Card card : deck.getCards()) 
		this.cards.add(card);
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
}





