package es.diego.castano.klondike.views;

import es.diego.castano.klondike.models.Klondike;
import es.diego.castano.klondike.models.menu.Menu;

public class GameView implements View {

	private Menu menu;
	private MenuView menuView;
	
	public GameView(Menu menu) {
		this.menu = menu;
		this.menuView = new MenuView(menu);
	}
	
	@Override
	public void render() {
		do {
			IO io = new IO();
			io.writeln("===========================");
			io.writeln("Baraja: ");
			io.writeln("Descarte: ");
			io.writeln("Palo copas: ");
			io.writeln("Palo espadas: ");
			io.writeln("Palo bastos: ");
			for (int i = 0; i < Klondike.NUM_TABLEAUS; i++) {
				io.writeln("Escalera " + (i + 1) + ": ");	
			}
			io.writeln("---------------------------");
			menuView.render();
			
		} while(Klondike.playing);
	}

}
