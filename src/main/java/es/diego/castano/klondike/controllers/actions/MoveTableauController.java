package es.diego.castano.klondike.controllers.actions;

import java.util.ArrayList;

import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;

public abstract class MoveTableauController extends MoveController {
	protected int tableauIndex = 0;
	
	public MoveTableauController(Deck deck, Waste waste, ArrayList<Foundation> foundations,
			ArrayList<Tableau> tableaus) {
		super(deck, waste, foundations, tableaus);
	}
	
	public boolean isTableauEmpty(int tableauIndex) {
		return tableaus.get(tableauIndex).isEmpty();
	}
	
	public void setTableauIndex(int index){
		tableauIndex = index;
	}

}
