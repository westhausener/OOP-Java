
public class Pinguin extends ZooTier{

	private int groesse;
	
	public Pinguin(String name, int gewicht, int groesse) {
		super(name, gewicht);
		this.groesse = groesse;
	}

	public int getGroesse() {
		return groesse;
	}
	
		
}
