package es.diego.castano.klondike.views;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cardstacks.Tableau;
import es.diego.castano.klondike.utils.IO;

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
				Card card = tableau.getCards().get(i);
				if (card.isFaceUp()) {
					new CardView(card).render();
				} else {
					io.write("[");
				}
			}
			new CardView(tableau.viewCardFromTop()).render();
		}
	}
}
