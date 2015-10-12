package es.diego.castano.klondike.cards;

public enum Number {
	AS("A"), 
	DOS("2"), 
	TRES("3"), 
	CUATRO("4"), 
	CINCO("5"), 
	SEIS("6"), 
	SIETE("7"), 
	OCHO("8"), 
	NUEVE("9"), 
	DIEZ("10"), 
	SOTA("J"), 
	CABALLO("Q"), 
	REY("K");

    private final String name;       

    private Number(String name) {
        this.name = name;
    }

	public String toString() {
		return this.name;
	}
}
