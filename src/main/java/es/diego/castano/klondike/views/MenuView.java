package es.diego.castano.klondike.views;

import es.diego.castano.klondike.models.menu.Menu;

public class MenuView implements View {

	private Menu menu;
	
	public MenuView(Menu menu) {
		this.menu = menu;
	}
	
	@Override
	public void render() {
		int maxOption = menu.getOptions().size();
		IO io = new IO();
		boolean validOption;
		do {
			renderOptions(io);
			int option = io.readInt("Opción? [1-" + maxOption + "]:");
			validOption = isValid(option);
			if (validOption) {
				menu.getOptions().get(option - 1).getView().render();
			} else {
				io.writeln("ERROR!!! La opción debe ser entre 1 y " + maxOption + " inclusives");
			}
		} while (!validOption);
	}
	
	private boolean isValid (int optionNumber) {
		return optionNumber > 0 && optionNumber <= menu.getOptions().size();
	}
	
	private void renderOptions(IO io) {
		for (int i = 0; i < menu.getOptions().size(); i++) {
			io.writeln((i + 1) + ". " + menu.getOptions().get(i).getName());
		}
	}
}
