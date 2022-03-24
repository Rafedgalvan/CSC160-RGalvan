
public class Card {

	private int rank ;
	private int suit;
	
	public final String[] RANK = {
			null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
	};
	public final String[] SUITS = {
			"Clubs", "Diamonds", "Hearts", "Spades"
	};
	
	public Card(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return (RANK[this.rank] + " of " + SUITS[this.suit]);
	}
	
	
	
}