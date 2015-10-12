package es.diego.castano.klondike.models.cardstacks;

import java.util.Collections;
import java.util.Stack;

import es.diego.castano.klondike.models.cards.Card;

public abstract class CardStack {
	
	private Stack<Card> cards;
	
	public CardStack() {
		this.cards = new Stack<>();
	}
	
	public void putCardOnTop(Card card) {
		cards.push(card);
	}
	
	public Card takeCardFromTop() {
		return cards.pop();
	}
	
	public Card viewCardFromTop() {
		return cards.peek();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
	
	public int getSize() {
		return this.cards.size();
	}
	
	public abstract boolean isValidOnTop (Card card);
}
