package es.diego.castano.klondike.controllers.actions;

import java.util.ArrayList;

import es.diego.castano.klondike.controllers.Controller;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;

public abstract class MoveController extends Controller {

	public MoveController(Deck deck, Waste waste, ArrayList<Foundation> foundations, ArrayList<Tableau> tableaus) {
		super(deck, waste, foundations, tableaus);
	}
	
	public abstract void move();
}
