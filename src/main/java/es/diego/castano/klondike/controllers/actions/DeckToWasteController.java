package es.diego.castano.klondike.controllers.actions;

import java.util.ArrayList;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;

public class DeckToWasteController extends MoveController {

	public DeckToWasteController(Deck deck, Waste waste, 
			ArrayList<Foundation> foundations,
			ArrayList<Tableau> tableaus) {
		super(deck, waste, foundations, tableaus);
	}

	@Override
	public void move() {
		for (int i = 0; i < Waste.MAX_SIZE; i++) {
			Card card = deck.takeCardFromTop();
			card.flip();
			waste.putCardOnTop(card);			
		}
	}

	public boolean isDeckEmpty() {
		return deck.isEmpty();
	}

	public boolean isWasteEmpty() {
		return waste.isEmpty();
	}
	
}
