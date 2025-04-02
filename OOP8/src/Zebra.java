
public class Zebra extends ZooTier{

	private int anzahlStreifen;
	
	public Zebra(String name, int gewicht, int anzahlStreifen) {
		super(name, gewicht);
		this.anzahlStreifen = anzahlStreifen;
	}

	public int getAnzahlStreifen() {
		return anzahlStreifen;
	}

	
}
