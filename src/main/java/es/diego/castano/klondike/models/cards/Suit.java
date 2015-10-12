package es.diego.castano.klondike.models.cards;

public enum Suit {
	OROS("o"),
	COPAS("c"),
	ESPADAS("e"),
	BASTOS("b");
	
	private final String name;
	
	private Suit(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
