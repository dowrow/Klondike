package es.diego.castano.klondike.cards;

public enum Suit {
	OROS("o"),
	ESPADAS("e"),
	BASTOS("b"),
	COPAS("c");
	
	private final String name;
	
	private Suit(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
