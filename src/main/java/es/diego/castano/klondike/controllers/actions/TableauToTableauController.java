package es.diego.castano.klondike.controllers.actions;

import java.util.ArrayList;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;

public class TableauToTableauController extends MoveTableauController {
	
	private int destinationTableauIndex;
	
	public TableauToTableauController(Deck deck, Waste waste, ArrayList<Foundation> foundations,
			ArrayList<Tableau> tableaus) {
		super(deck, waste, foundations, tableaus);
	}

	@Override
	public void move() {
		Card topCard = tableaus.get(tableauIndex).takeCardFromTop();
		tableaus.get(destinationTableauIndex).putCardOnTop(topCard);
	}
	
	public boolean isValid() {
		Card card = tableaus.get(tableauIndex).viewCardFromTop();
		return tableaus.get(destinationTableauIndex).isValidOnTop(card);
	}

	public void setDestinationTableauIndex(int index) {
		destinationTableauIndex = index;
	}

}
