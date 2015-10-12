package es.diego.castano.klondike.controllers.actions;

import java.util.ArrayList;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;

public class WasteToDeckController extends MoveController {

	public WasteToDeckController(Deck deck, Waste waste, ArrayList<Foundation> foundations,
			ArrayList<Tableau> tableaus) {
		super(deck, waste, foundations, tableaus);
	}

	@Override
	public void move() {
		while (!waste.isEmpty()) {
			Card card = waste.takeCardFromTop();
			card.flip();
			deck.putCardOnBottom(card);
		}
	}

	public boolean isWasteEmpty() {
		return waste.isEmpty();
	}

}
