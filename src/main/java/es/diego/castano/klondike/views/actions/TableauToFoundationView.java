package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.TableauToFoundationController;
import es.diego.castano.klondike.utils.IO;
import es.diego.castano.klondike.views.View;

public class TableauToFoundationView implements View {
	
	private TableauToFoundationController controller;
	
	public TableauToFoundationView(TableauToFoundationController tableauToFoundationController) {
		controller = tableauToFoundationController;
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Tableau to foundation view");
	}

}
