package es.diego.castano.klondike.models.menu;
import es.diego.castano.klondike.views.View;

public class Option {
	
	private String name;
	private View view;
	
	public Option(String name, View view) {
		this.name = name;
		this.view = view;
	}
	
	public String getName() {
		return this.name;
	}
	
	public View getView() {
		return this.view;
	}
}
