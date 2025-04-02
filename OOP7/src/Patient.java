
public class Patient {

	private int patientID;
	private String vorname;
	private String nachname;
	private String versicherung;
	
	// vorhandener Patient
	public Patient(int patientID) {
		
		// Datenbankverbindung aufbauen, Patientendaten abfragen
		//...
		
	}

	// neuer Patient
	public Patient(String vorname, String nachname, String versicherung){
		
		// Datenbankverbindung aufbauen, Patientendaten einfügen
		// insertID als patientID setzen
		this.vorname = vorname;
		this.nachname = nachname;
		this.versicherung = versicherung;
			
	}

	// Patient nicht ansprechbar/unbekannt
	public Patient(){
		this("unbekannt", "unbekannt", "unbekannt");
	}
	
}
