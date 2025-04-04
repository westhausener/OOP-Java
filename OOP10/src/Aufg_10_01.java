import javax.swing.JFrame;

public class Aufg_10_01 {

	public static void main(String[] args) {

		int zaehler = 4;
		int nenner = 2;
		JFrame f = null;
		
		try{
		
			System.out.println("Ergebnis: "+ (zaehler/nenner));
			
			f.dispose();
		
		}

		catch(ArithmeticException e){
			System.out.println("Fehler: Division durch 0!");
		}
		catch(Exception e){
			System.out.println("Fehler: "+e.getMessage());
		}
		

		
		finally {
			System.out.println("Ende des Programms.");
		}
		
	}

}
