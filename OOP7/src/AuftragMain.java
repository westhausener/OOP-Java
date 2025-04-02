
public class AuftragMain {

	public static void main(String[] args) {
		
		Auftrag[] aufArray = new Auftrag[5];
		
		aufArray[0] = new Auftrag("Klimaanlage reparieren", "Dr. Müller", 3);
		aufArray[1] = new Auftrag("Glühbirne wechseln", "Frau Trulla", 1);
		aufArray[2] = new Auftrag("Kartenautomat updaten", "Herr Hilbert");
		aufArray[3] = new Auftrag("Klospülung reparieren", "Peter Puller");
		aufArray[4] = new Auftrag("Alarmanlage einbauen", "Chef", 1);
		
		// Alle Aufträge mit Priorität 1 ausgeben
		for(Auftrag a : aufArray){
			if(a.getPrioritaet()==1){
				System.out.println("Auftrag: "+a.getTitel());
				System.out.println("Auftraggeber: "+a.getAuftragGeber());
			}
		}

	}
	

}
