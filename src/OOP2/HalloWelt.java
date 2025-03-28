

public class HalloWelt {

	public static void main(String[] args) {
		
		String s = "Hallo Welt!";
		
		Kuh Bertha = new Kuh();
		Kuh.anzahl = Kuh.anzahl + 1 ;
		Bertha.stall = "FOMStall";
		Bertha.gewicht = -6;
		
		Kuh Frieda = new Kuh();
		
		Frieda = Bertha;
		
		Bertha.geburtsdatum = "24.12.2023";
		Frieda.geburtsdatum = "1.1.2020";
			
		
		System.out.println(s);
		System.out.println(Frieda.geburtsdatum);
		System.out.println(Bertha.geburtsdatum);
		
		
		int a = 5;
		int b;
		b = a;
		a = 9;
		
		System.out.println(a);
		System.out.println(b);
		
		
		Kuh Lena;
		
		Lena = new Kuh();
		Kuh.anzahl++;
		
		//Lena.geburtsdatum = "5.4.2010";
		
		System.out.println(Kuh.anzahl);
	}

}
