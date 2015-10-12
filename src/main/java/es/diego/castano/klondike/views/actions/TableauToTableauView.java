package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.TableauToTableauController;
import es.diego.castano.klondike.views.IO;
import es.diego.castano.klondike.views.View;

public class TableauToTableauView implements View {
	
	private TableauToTableauController controller;
	
	public TableauToTableauView(TableauToTableauController tableauToTableauController) {
		controller = tableauToTableauController;
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Tableau to tableau view");
	}

}
