package es.diego.castano.klondike.views;

import es.diego.castano.klondike.models.cardstacks.Tableau;

public class TableauView implements View {
	
	private Tableau tableau;
	
	public TableauView(Tableau tableau) {
		this.tableau = tableau;
	}
	
	@Override
	public void render() {
		IO io = new IO();
		if (tableau.isEmpty()) {
			io.write("<vacío>");
		} else {
			for (int i = 0; i < (tableau.getSize() - 1); i++) {
				io.write("[");
			}
			new CardView(tableau.viewCardFromTop()).render();
		}
	}

}
