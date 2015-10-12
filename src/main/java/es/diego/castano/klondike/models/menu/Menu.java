package es.diego.castano.klondike.models.menu;

import java.util.ArrayList;

public class Menu {
	
	private ArrayList<Option> options;
	
	public ArrayList<Option> getOptions() {
		return options;
	}

	public Menu() {
		this.options = new ArrayList<>();
	}
	
	public void addOption(Option option) {
		this.options.add(option);
	}
	
}
