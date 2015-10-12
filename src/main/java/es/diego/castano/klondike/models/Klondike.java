package es.diego.castano.klondike.models;

import java.util.ArrayList;

import es.diego.castano.klondike.controllers.StartController;
import es.diego.castano.klondike.models.cards.Suit;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;
import es.diego.castano.klondike.views.GameView;

public class Klondike {
	
	public static final int NUM_TABLEAUS = 7;
	
	Deck deck;
	Waste waste;
	ArrayList<Foundation> foundations;
	ArrayList<Tableau> tableaus;
	StartController startController;
	GameView gameView;
	
	public Klondike() {
		deck = new Deck();
		waste = new Waste();
		foundations = createFoundations();
		tableaus = createTableaus();
		startController = new StartController(deck, waste, foundations, tableaus);
		gameView = new GameView(deck, waste, foundations, tableaus);
	}
	
	private ArrayList<Tableau> createTableaus() {
		ArrayList<Tableau> newTableaus = new ArrayList<>();
		for (int i = 0; i < NUM_TABLEAUS; i++) {
			newTableaus.add(new Tableau());
		}
		return newTableaus;
	}

	private ArrayList<Foundation> createFoundations() {
		ArrayList<Foundation> newFoundations = new ArrayList<>();
		for (Suit suit : Suit.values()) {
			newFoundations.add(new Foundation(suit));
		}
		return newFoundations;
	}
	

	public void play() {
		startController.setUp();
		gameView.render();
	}
	
	public static void main(String[] args) {
		new Klondike().play();
	}

}
