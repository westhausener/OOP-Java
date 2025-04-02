
public class Aufg_05_07 {

	
	public static void main(String[] args) {
		
		int n, i;
		int produkt = 1;
		
		System.out.println("Fakultaetsberechnung");
		n = Tools.intEingabe();
		
		for(i=1; i<=n; i++){
			produkt*=i;
		}
		
		System.out.println("Ergebnis für "+n+"! ist "+produkt+".");

	}

}
