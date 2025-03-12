package OOP5;

public class Aufg_05_07 {

	
	public static void main(String[] args) {
		
		int n, i;
		long produkt = 1;
		
		System.out.println("Fakultaetsberechnung");
		n = 67;
		
		i = 1;
		while (i <= n) {
			produkt *= i;
			i++;
		}
		
		for(i=1; i<=n; i++){
			produkt*=i;
			
		}
		
		System.out.println("Ergebnis f�r "+n+"! ist "+produkt+".");

	}

}
