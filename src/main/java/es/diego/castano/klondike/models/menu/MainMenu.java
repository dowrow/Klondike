package es.diego.castano.klondike.models.menu;

public class MainMenu extends Menu {
	public MainMenu() {
		addOption(new Option("Mover de baraja a descarte", null));
		addOption(new Option("Mover de descarte a baraja", null));
		addOption(new Option("Mover de descarte a palo", null));
		addOption(new Option("Mover de descarte a escalera", null));
		addOption(new Option("Mover de escalera a palo", null));
		addOption(new Option("Mover de escalera a escalera", null));
		addOption(new Option("Mover de palo a escalera", null));
		addOption(new Option("Voltear en escalera", null));
		addOption(new Option("Salir", null));
	}
}
