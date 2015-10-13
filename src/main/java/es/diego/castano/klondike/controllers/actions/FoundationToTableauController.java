package es.diego.castano.klondike.controllers.actions;

import java.util.ArrayList;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;

public class FoundationToTableauController extends MoveController {

	private int foundationIndex = 0;
	private int tableauIndex = 0;

	public FoundationToTableauController(Deck deck, Waste waste, ArrayList<Foundation> foundations,
			ArrayList<Tableau> tableaus) {
		super(deck, waste, foundations, tableaus);
	}

	public void setFoundationIndex(int index) {
		foundationIndex = index;
	}

	public void setTableauIndex(int index) {
		tableauIndex = index;
	}

	public boolean isValid() {
		Card card = foundations.get(foundationIndex).viewCardFromTop();
		return tableaus.get(tableauIndex).isValidOnTop(card);
	}

	@Override
	public void move() {
		Card topCard = foundations.get(foundationIndex).takeCardFromTop();
		tableaus.get(tableauIndex).putCardOnTop(topCard);
	}
}
