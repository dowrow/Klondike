package es.diego.castano.klondike.utils;

public class RangeSelector {
	public int read(int min, int max, String text, String error) {
		IO io = new IO();
		int selected;
		boolean ok = true;
		do {
			selected = io.readInt(text + " [" + min + "-" + max + "]: ");
			ok = selected >= min && selected <= max;
			if (!ok) {
				io.writeln(error);
			}
		} while(!ok);
		return selected;
	}
}
