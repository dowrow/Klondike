package es.diego.castano.klondike.views;

import es.diego.castano.klondike.controllers.ExitController;

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
