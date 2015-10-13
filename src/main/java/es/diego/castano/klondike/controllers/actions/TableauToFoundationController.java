package es.diego.castano.klondike.controllers.actions;

import java.util.ArrayList;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;

public class TableauToFoundationController extends MoveTableauController {

	public TableauToFoundationController(Deck deck, Waste waste, ArrayList<Foundation> foundations,
			ArrayList<Tableau> tableaus) {
		super(deck, waste, foundations, tableaus);
	}

	@Override
	public void move() {
		Card card = tableaus.get(tableauIndex).viewCardFromTop();
		for (Foundation foundation : foundations) {
			if (foundation.isValidOnTop(card)) {
				Card topCard = tableaus.get(tableauIndex).takeCardFromTop();
				foundation.putCardOnTop(topCard);
				return;
			}
		}	
	}
	
	public boolean isValid() {
		Card card = tableaus.get(tableauIndex).viewCardFromTop();
		for (Foundation foundation : foundations) {
			if (foundation.isValidOnTop(card)) {
				return true;
			}
		}	
		return false;
	}
}
