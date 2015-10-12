package es.diego.castano.klondike.controllers;

import java.util.ArrayList;

import es.diego.castano.klondike.models.Klondike;
import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;

public class StartController extends Controller {

	public StartController(Deck deck, Waste waste, 
			ArrayList<Foundation> foundations, ArrayList<Tableau> tableaus) {
		super(deck, waste, foundations, tableaus);
	}
	
	public void setUp(){
		deck.shuffle();
		dealTableaus();
	}

	private void dealTableaus() {
		for (int i = 0; i < Klondike.NUM_TABLEAUS; i++) {
			for (int j = 0; j < (i + 1); j++) {
				Card card = deck.takeCardFromTop();
				tableaus.get(Klondike.NUM_TABLEAUS - 1 - i).putCardOnTop(card);
			}
			tableaus.get(Klondike.NUM_TABLEAUS - 1 - i).flipTopCard();
		}
	}
}
