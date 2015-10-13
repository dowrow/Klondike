package es.diego.castano.klondike.views;

import es.diego.castano.klondike.models.cardstacks.Foundation;
import es.diego.castano.klondike.utils.IO;

public class FoundationView implements View {
	
	private Foundation foundation;
	
	public FoundationView(Foundation foundation) {
		this.foundation = foundation;
	}

	@Override
	public void render() {
		IO io = new IO();
		if (foundation.isEmpty()) {
			io.write("<vacío>");
		} else {
			new CardView(foundation.viewCardFromTop()).render();
		}
	}
}
