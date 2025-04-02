
public class Laserdrucker implements Drucker, Cloneable{

	private int seiten = 100;
	
	@Override
	public void drucke(String s) {
		System.out.println(s);
		seiten--;
	}

	@Override
	public int getSeiten() {
		return seiten;
	}

	public Laserdrucker clone() throws CloneNotSupportedException{
		
		return (Laserdrucker) super.clone();
	}
	
	
}

//-----------------------------------------------------------------------------------------------------
// Subklasse soll nicht geklont werden
class SpezialLaserdrucker extends Laserdrucker{

	// Das Klonen verbieten
	public SpezialLaserdrucker clone() throws CloneNotSupportedException{
		
		throw new CloneNotSupportedException();
	}
}

