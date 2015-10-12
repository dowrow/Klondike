package es.diego.castano.klondike.models.menu;
import es.diego.castano.klondike.controllers.Controller;

public class Option {
	
	private String name;
	private Controller controller;
	
	public Option(String name, Controller controller) {
		this.name = name;
		this.controller = controller;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Controller getController() {
		return this.controller;
	}
}
