package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.ExitController;
import es.diego.castano.klondike.views.IO;
import es.diego.castano.klondike.views.View;

public class ExitView implements View {

	private ExitController controller;
	
	public ExitView(ExitController exitController) {
		this.controller = exitController;
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Exit view");
	}

}
