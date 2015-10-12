package es.diego.castano.klondike.cardStacks;

import es.diego.castano.klondike.cards.Card;
import es.diego.castano.klondike.cards.Number;
import es.diego.castano.klondike.cards.Suit;

public class Deck extends CardStack {
	public Deck(){
		for (Suit suit : Suit.values()){
			for (Number number : Number.values()) {
				this.putCardOnTop(new Card(number, suit));
			}	
		}
	}
	
	@Override
	public String toString() {
		if (isEmpty()) {
			return "<vacio>";
		} else{
			return this.viewCardFromTop().toString();	
		}
	}
}
