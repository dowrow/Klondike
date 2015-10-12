package es.diego.castano.klondike.models.cardstacks;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cards.Number;
import es.diego.castano.klondike.models.cards.Suit;

public class Deck extends CardStack {
	
	public Deck(){
		for (Suit suit : Suit.values()){
			for (Number number : Number.values()) {
				this.putCardOnTop(new Card(number, suit));
			}	
		}
	}
}
