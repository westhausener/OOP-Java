import java.util.*;


public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> telefonbuch = new HashMap<String, String>();
		
		telefonbuch.put("Klopp", "0231-123456");
		telefonbuch.put("Kuba", "0231-654321");
		telefonbuch.put("Ulla", "0231-123456"); // wohnt bei Klopp
		
		// Ausgabe der Telefonnummer von Kuba
		System.out.println("Kubas Nummer: "+telefonbuch.get("Kuba"));
		
		// unbekannte Nummer
		System.out.println("Peters Nummer: "+telefonbuch.get("Peter"));
		
		// Alle Nummern ausgeben
		Set<String> namen = telefonbuch.keySet();
		for(String name : namen){
			System.out.print("Nummer von " + name +":\t");
			System.out.println(telefonbuch.get(name));
		}

	}

}
