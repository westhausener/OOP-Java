import javax.swing.JFrame;

public class Aufg_10_01 {

	public static void main(String[] args) {

		int zaehler = 4;
		int nenner = 1;
		JFrame f = null;
		
		try{
		
			System.out.println("Ergebnis: "+ (zaehler/nenner));
			
			f.dispose();
		
		}catch(Exception e){
			System.err.println("Fehler: "+e.getMessage());
		}
		
	}

}
