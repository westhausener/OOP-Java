import javax.swing.JOptionPane;


public class Aufg_15_11 {

	
	public static void main(String[] args) {
		
		String[] options = {"gut", "mittel", "schlecht"};
		
		int n = JOptionPane.showOptionDialog(null, "Wie geht es dir?", "Eine kleine Frage", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, null, null);
			
		// gut -> Warnmeldung:"Es kommen auch wieder schlechtere Zeiten!"
		// mittel -> Info-Meldung:"Da kann man ja mit leben."
		// schlecht -> Fehlermeldung:"Kopf hoch, gleich ist Feierabend."
		
		switch(n){	
		case -1: System.out.println("Es wurde auf das X geklickt!");
		break;
		case 0: JOptionPane.showMessageDialog(null, "Es kommen auch wieder andere Zeiten!", "Warnung", JOptionPane.WARNING_MESSAGE);
		break;
		case 1: JOptionPane.showMessageDialog(null, "Da kann man ja mit leben.");
		break;
		case 2: JOptionPane.showMessageDialog(null, "Kopf hoch, gleich ist Feierabend.", "Fehler", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
