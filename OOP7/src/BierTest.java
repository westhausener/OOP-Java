
public class BierTest {

	
	public static void main(String[] args) {
		
		Bierfass bf1 = new Bierfass("Pils", 80);
		Bierfass bf2 = new Bierfass("Alt", 100);
		Bierfass bf3 = new Bierfass("Kölsch", 50);

		bf1.print();
		bf2.print();
		bf3.print();
		System.out.println("Anzahl.Fässer: "+Bierfass.getAnzahlFaesser());
		System.out.println("Liter insgesamt: "+Bierfass.getLiterGesamt());
		System.out.println("---------------------------------------------");
		
		bf1.zapfen(20);
		bf2.zapfen(10);
		bf3.zapfen(50);
		
		bf1.print();
		bf2.print();
		bf3.print();
		System.out.println("Anzahl.Fässer: "+Bierfass.getAnzahlFaesser());
		System.out.println("Liter insgesamt: "+Bierfass.getLiterGesamt());
		
	}

}
