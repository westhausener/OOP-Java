import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class JOptionPaneTest {

	
	public static void main(String[] args) {
		
				
		//default title and icon
		JOptionPane.showMessageDialog(null, "Es ist kalt.");
		
		
		//custom title, warning icon
		JOptionPane.showMessageDialog(null,
		    "Es ist kalt.",
		    "Kältewarnung",
		    JOptionPane.WARNING_MESSAGE);
		
		
		//custom title, error icon
		JOptionPane.showMessageDialog(null,
		    "Es ist zu kalt!",
		    "Kältefehler",
		    JOptionPane.ERROR_MESSAGE);
						
		
		
		//Custom button text
		String[] options = {"Ja, bitte",
		                    "Nein, danke",
		                    "Abbrechen"};
		
		int n = JOptionPane.showOptionDialog(null,
		    "Temperatur erhöhen?",
		    "Frage zum Heizen",
		    JOptionPane.YES_NO_CANCEL_OPTION,
		    JOptionPane.QUESTION_MESSAGE,
		    null,
		    options,
		    options[2]);
		
		System.out.println("Rückgabewert: "+n);
		
	}

}
