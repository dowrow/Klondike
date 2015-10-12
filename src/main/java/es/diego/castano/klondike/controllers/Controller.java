package es.diego.castano.klondike.controllers;

import java.util.ArrayList;

import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Waste;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;

public abstract class Controller {
	
	private Deck deck;
	private Waste waste;
	private ArrayList<Foundation> foundations;
	private ArrayList<Tableau> tableaus;
	
	public Controller (Deck deck, Waste waste, 
			ArrayList<Foundation> foundations, 
			ArrayList<Tableau> tableaus) {
		this.deck = deck;
		this.waste = waste;
		this.foundations = foundations;
		this.tableaus = tableaus;
	}
}
