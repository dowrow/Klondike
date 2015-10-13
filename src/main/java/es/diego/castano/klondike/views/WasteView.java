package es.diego.castano.klondike.views;

import es.diego.castano.klondike.models.cardstacks.Waste;

public class WasteView implements View {
	
	private Waste waste;
	
	public WasteView(Waste waste) {
		this.waste = waste;
	}

	@Override
	public void render() {
		IO io = new IO();
		if (waste.isEmpty()) {
			io.write("<vacío>");
		} else {
			for (int i = 0; i < waste.getSize(); i++) {
				new CardView(this.waste.getCards().get(i)).render();
			}	
		}
	}
}
