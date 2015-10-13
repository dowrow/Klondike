package es.diego.castano.klondike.controllers.actions;

import java.util.ArrayList;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;

public class WasteToFoundationController extends MoveWasteController {

	public WasteToFoundationController(Deck deck, Waste waste, ArrayList<Foundation> foundations,
			ArrayList<Tableau> tableaus) {
		super(deck, waste, foundations, tableaus);
	}

	public void move() {
		Card card = waste.viewCardFromTop();
		for (Foundation foundation : foundations) {
			if (foundation.isValidOnTop(card)) {
				Card topCard = waste.takeCardFromTop();
				foundation.putCardOnTop(topCard);
			}
		}
	}
	
	public boolean isPossible() {
		Card card = waste.viewCardFromTop();
		for (Foundation foundation : foundations) {
			if (foundation.isValidOnTop(card)) {
				return true;
			}
		}
		return false;
	}
	
}
