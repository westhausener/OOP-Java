import java.util.Date;
import java.text.*;

public class Aufg_10_02{

	public static Date pruefeDatum (String datum) throws ParseException {  

		// Eine auf die Rechnerlokation abgestimmte Instanz der Klasse
		// DateFormat wird erzeugt.
		DateFormat df = DateFormat.getDateInstance();

		// strenge Datumspruefung einschalten
		df.setLenient (false);

		// Datum Ueberpruefen und in ein Date-Objekt wandeln.
		// Die Methode parse() wirft eine ParseException, wenn in
		// datum kein gueltiges Datum steht.
		Date d = df.parse (datum);
		return d;
	}

	public static void main (String[] args) {

		
			String testDatum = "24.12.2011"; 

			Date datum = null;

			

					datum = pruefeDatum (testDatum);
					System.out.println ("Eingegebenes Datum ist ok:\n" + datum);
				
				
				
		

			

		



	}
}
