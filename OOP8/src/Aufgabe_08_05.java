
public class Aufgabe_08_05 {

	public static void main(String[] args) {
		
		// Zebra und Pinguin erzeugen
		Zebra marty = new Zebra("Marty", 400, 22);
		Pinguin kowalski = new Pinguin("Kowalski", 80, true);
		
		// polymorphe Methode aufrufen
		polymorpheMethode(marty);
		polymorpheMethode(kowalski);
		
	}


	
public static void polymorpheMethode(ZooTier z){
		
		System.out.println("Gewicht " + z.getGewicht());
		System.out.println("Name " + z.getName() );
		
		System.out.println("Name " + z.getClass() );
		
		if (z.getClass() == Zebra.class) {
			Zebra z1 = (Zebra) z;
			System.out.println(z1.getAnzahlStreifen());
		}
			
		
		
				
		
		}
	
}
