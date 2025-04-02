
public class DruckerTest {

	public static void main(String[] args) {
		
		// Standardkonstruktor aufrufen
		Laserdrucker laserdrucker1 = new Laserdrucker();
		
		// um die Exception auszulösen
		SpezialLaserdrucker sld = new SpezialLaserdrucker();
		
		try {
			
			//Laserdrucker laserdrucker2 = laserdrucker1.clone();
			Laserdrucker laserdrucker2 = sld.clone();
			
			System.out.println("Seiten Laserdrucker 1: "+laserdrucker1.getSeiten());
			laserdrucker1.drucke("Dies ist ein Test.");
			laserdrucker1.drucke("Dies ist ein Test.");
			System.out.println("Seiten Laserdrucker 1: "+laserdrucker1.getSeiten());
			
			System.out.println("Seiten Laserdrucker 2: "+laserdrucker2.getSeiten());
			laserdrucker2.drucke("Dies ist ein Test.");
			System.out.println("Seiten Laserdrucker 2: "+laserdrucker2.getSeiten());
			
		} catch (CloneNotSupportedException e) {
			System.err.println("Fehler: Klonen geht nicht!");
		}				

	}

}
