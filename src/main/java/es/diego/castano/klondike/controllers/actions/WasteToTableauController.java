package es.diego.castano.klondike.controllers.actions;

import java.util.ArrayList;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;

public class WasteToTableauController extends MoveWasteController {
	
	private int tableauIndex;
	
	public WasteToTableauController(Deck deck, Waste waste, 
			ArrayList<Foundation> foundations,
			ArrayList<Tableau> tableaus) {
		super(deck, waste, foundations, tableaus);
	}

	public void setTableauIndex(int index) {
		tableauIndex = index;
	}

	@Override
	public void move() {
		Card topCard = waste.takeCardFromTop();
		tableaus.get(tableauIndex).putCardOnTop(topCard);
	}
}
