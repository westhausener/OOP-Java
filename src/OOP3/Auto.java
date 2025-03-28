package OOP3;

public class Auto {
	
	public int ps;
	boolean automatik;
	char klasse;
	public String hersteller;

	public static int anzahl;

	public Auto(String hersteller, int ps, boolean automatik, char klasse) {
		this.hersteller = hersteller;
		this.ps = ps;
		this.automatik = automatik;
		this.klasse = klasse;

		anzahl++;
		
		System.out.println("Anzahl Autos: " + anzahl);
		System.out.println("Auto " + anzahl + " : " + hersteller + " " + ps);

		

	}

	
	
}


