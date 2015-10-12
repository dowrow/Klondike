package es.diego.castano.klondike.models.menu;

import java.util.ArrayList;

import es.diego.castano.klondike.controllers.DeckToWasteController;
import es.diego.castano.klondike.controllers.ExitController;
import es.diego.castano.klondike.controllers.FlipOnTableauController;
import es.diego.castano.klondike.controllers.FoundationToTableauController;
import es.diego.castano.klondike.controllers.TableauToFoundationController;
import es.diego.castano.klondike.controllers.TableauToTableauController;
import es.diego.castano.klondike.controllers.WasteToDeckController;
import es.diego.castano.klondike.controllers.WasteToFoundationController;
import es.diego.castano.klondike.controllers.WasteToTableauController;
import es.diego.castano.klondike.models.cardstacks.Deck;
import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.models.cardstacks.Waste;
import es.diego.castano.klondike.views.DeckToWasteView;
import es.diego.castano.klondike.views.ExitView;
import es.diego.castano.klondike.views.FlipOnTableauView;
import es.diego.castano.klondike.views.FoundationToTableauView;
import es.diego.castano.klondike.views.TableauToFoundationView;
import es.diego.castano.klondike.views.TableauToTableauView;
import es.diego.castano.klondike.views.WasteToDeckView;
import es.diego.castano.klondike.views.WasteToFoundationView;
import es.diego.castano.klondike.views.WasteToTableauView;

public class MainMenu extends Menu {
	
	DeckToWasteController deckToWasteController;
	ExitController exitController;
	FlipOnTableauController flipOnTableauController;
	FoundationToTableauController foundationToTableauController;
	TableauToFoundationController tableauToFoundationController;
	TableauToTableauController tableauToTableauController;
	WasteToDeckController wasteToDeckController;
	WasteToFoundationController wasteToFoundationController;
	WasteToTableauController wasteToTableauController;
	
	public MainMenu(Deck deck, Waste waste,
			ArrayList<Foundation> foundations, 
			ArrayList<Tableau> tableaus) {
		createControllers(deck, waste, foundations, tableaus);
		addOptions();
	}

	private void createControllers(Deck deck, Waste waste,
			ArrayList<Foundation> foundations, 
			ArrayList<Tableau> tableaus) {
		deckToWasteController = new DeckToWasteController(deck, waste, foundations, tableaus);
		exitController = new ExitController(deck, waste, foundations, tableaus);
		flipOnTableauController = new FlipOnTableauController(deck, waste, foundations, tableaus);
		foundationToTableauController = new FoundationToTableauController(deck, waste, foundations, tableaus);
		tableauToFoundationController = new TableauToFoundationController(deck, waste, foundations, tableaus);
		tableauToTableauController = new TableauToTableauController(deck, waste, foundations, tableaus);
		wasteToDeckController = new WasteToDeckController(deck, waste, foundations, tableaus);
		wasteToFoundationController = new WasteToFoundationController(deck, waste, foundations, tableaus);
		wasteToTableauController = new WasteToTableauController(deck, waste, foundations, tableaus);
	}

	private void addOptions() {
		addOption(new Option("Mover de baraja a descarte", new DeckToWasteView(deckToWasteController)));
		addOption(new Option("Mover de descarte a baraja", new WasteToDeckView(wasteToDeckController)));
		addOption(new Option("Mover de descarte a palo", new WasteToFoundationView(wasteToFoundationController)));
		addOption(new Option("Mover de descarte a escalera", new WasteToTableauView(wasteToTableauController)));
		addOption(new Option("Mover de escalera a palo", new TableauToFoundationView(tableauToFoundationController)));
		addOption(new Option("Mover de escalera a escalera", new TableauToTableauView(tableauToTableauController)));
		addOption(new Option("Mover de palo a escalera", new FoundationToTableauView(foundationToTableauController)));
		addOption(new Option("Voltear en escalera", new FlipOnTableauView(flipOnTableauController)));
		addOption(new Option("Salir", new ExitView(exitController)));
	}

}
