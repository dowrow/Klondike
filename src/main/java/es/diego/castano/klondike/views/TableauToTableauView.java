package es.diego.castano.klondike.views;

import es.diego.castano.klondike.controllers.TableauToTableauController;

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
