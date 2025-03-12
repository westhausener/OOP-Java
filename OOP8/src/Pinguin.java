
public class Pinguin extends ZooTier{

	private boolean koenig;
	
	public Pinguin(String name, int gewicht, boolean koenig) {
		super(name, gewicht);
		this.koenig = koenig;
	}

	public boolean getGroesse() {
		return koenig;
	}
	
		
}
