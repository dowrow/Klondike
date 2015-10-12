package es.diego.castano.klondike.models.cards;

public enum Number {
	
	AS("A", 1), 
	DOS("2", 2), 
	TRES("3", 3), 
	CUATRO("4", 4), 
	CINCO("5", 5), 
	SEIS("6", 6), 
	SIETE("7", 7), 
	OCHO("8", 8), 
	NUEVE("9", 9), 
	DIEZ("10", 10), 
	SOTA("J", 11), 
	CABALLO("Q", 12), 
	REY("K", 13);

    private final String name; 
    private final int value;

    private Number(String name, int value) {
        this.name = name;
        this.value = value;
    }
    
    @Override
	public String toString() {
		return this.name;
	}
    
    public int getValue() {
    	return this.value;
    }
}
