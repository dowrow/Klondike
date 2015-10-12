package es.diego.castano.klondike.cards;

public class Card {
	private Number number;
	private Suit suit;
	private boolean faceUp;
	
	public Card(Number number, Suit suit){
		this.number = number;
		this.suit = suit;
		this.faceUp = false;
	}

	public Suit getSuit() {
		return this.suit;
	}
	
	public Number getNumber() {
		return this.number;
	}
	
	public boolean isFaceUp() {
		return this.faceUp;	
	}
	
	public void flip() {
		this.faceUp = !this.faceUp;
	}
	
	public String toString() {
		if (faceUp) {
			return "[" + this.number + "," + this.suit + "]";
		} else {
			return "[x,x]";
		}
	}
}
