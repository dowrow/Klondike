package es.diego.castano.klondike.models;

import java.util.ArrayList;

import es.diego.castano.klondike.models.cards.Suit;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;
import es.diego.castano.klondike.models.menu.MainMenu;
import es.diego.castano.klondike.views.GameView;

public class Klondike {
	
	public static final int NUM_TABLEAUS = 7;
	public static boolean playing = true;
	
	Deck deck;
	Waste waste;
	ArrayList<Foundation> foundations;
	ArrayList<Tableau> tableaus;
	MainMenu menu;
	GameView gameView;
	
	public Klondike() {
		deck = new Deck();
		waste = new Waste();
		foundations = createFoundations();
		tableaus = createTableaus();
		menu = new MainMenu();
		gameView = new GameView(menu);
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
		gameView.render();
	}
	
	public static void main(String[] args) {
		new Klondike().play();
	}

}
