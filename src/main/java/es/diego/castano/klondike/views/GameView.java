package es.diego.castano.klondike.views;

import java.util.ArrayList;

import es.diego.castano.klondike.models.Klondike;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;
import es.diego.castano.klondike.models.menu.MainMenu;
import es.diego.castano.klondike.utils.IO;

public class GameView implements View {

	Deck deck;
	Waste waste;
	ArrayList<Foundation> foundations;
	ArrayList<Tableau> tableaus;
	private MainMenu menu;
	private MenuView menuView;
	
	public GameView(Deck deck, Waste waste, 
			ArrayList<Foundation> foundations, 
			ArrayList<Tableau> tableaus) {
		this.deck = deck;
		this.waste = waste;
		this.foundations = foundations;
		this.tableaus = tableaus;
		this.menu = new MainMenu(deck, waste, foundations, tableaus);
		this.menuView = new MenuView(menu);
	}
	
	@Override
	public void render() {
		do {
			IO io = new IO();
			renderStacks(io);
			menuView.render();
		} while(true);
	}

	private void renderStacks(IO io) {
		io.writeln("===========================");
		io.write("Baraja: ");
		new DeckView(deck).render();
		io.writeln();
		io.write("Descarte: ");
		new WasteView(waste).render();
		io.writeln();
		io.write("Palo oros: ");
		new FoundationView(foundations.get(0)).render();
		io.writeln();
		io.write("Palo copas: ");
		new FoundationView(foundations.get(1)).render();
		io.writeln();
		io.write("Palo espadas: ");
		new FoundationView(foundations.get(2)).render();
		io.writeln();
		io.write("Palo bastos: ");
		new FoundationView(foundations.get(3)).render();
		io.writeln();
		for (int i = 0; i < Klondike.NUM_TABLEAUS; i++) {
			io.write("Escalera " + (i + 1) + ": ");	
			new TableauView(tableaus.get(i)).render();
			io.writeln();
		}
		io.writeln("---------------------------");
	}
}
