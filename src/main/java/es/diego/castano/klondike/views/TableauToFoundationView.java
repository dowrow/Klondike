package es.diego.castano.klondike.views;

import es.diego.castano.klondike.controllers.TableauToFoundationController;

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
