
public class Aufgabe_08_05 {

	public static void main(String[] args) {
		
		// Zebra und Pinguin erzeugen
		Zebra marty = new Zebra("Marty", 400, 22);
		Pinguin kowalski = new Pinguin("Kowalski", 80, 100);
		
		// polymorphe Methode aufrufen
		polymorpheMethode(marty);
		polymorpheMethode(kowalski);
		
	}
	
	public static void polymorpheMethode(ZooTier t){
				
		// Ausgabe von Name und Gewicht
		System.out.println("Name: "+t.getName());
		System.out.println("Gewicht: "+t.getGewicht());
		/*if(t instanceof Zebra){
			
			Zebra z = (Zebra) t;
			System.out.println("Anzahl Streifen: "+z.getAnzahlStreifen());
		}*/
		switch(t.getClass().getName()){
		case "Zebra": 
			System.out.println("Anzahl Streifen: "+((Zebra) t).getAnzahlStreifen());
		break;
		}
	}

}
