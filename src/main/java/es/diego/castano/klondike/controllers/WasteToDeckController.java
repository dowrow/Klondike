package es.diego.castano.klondike.controllers;

import java.util.ArrayList;

import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;

public class WasteToDeckController extends Controller {

	public WasteToDeckController(Deck deck, Waste waste, ArrayList<Foundation> foundations,
			ArrayList<Tableau> tableaus) {
		super(deck, waste, foundations, tableaus);
	}

}
