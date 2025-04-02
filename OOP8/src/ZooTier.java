
public abstract class ZooTier {
	
	protected String name;
	protected int gewicht;
	
	public ZooTier(String name, int gewicht){
		
		this.name = name;
		this.gewicht = gewicht;
	}

	public String getName() {
		return name;
	}

	public int getGewicht() {
		return gewicht;
	}

	
}
