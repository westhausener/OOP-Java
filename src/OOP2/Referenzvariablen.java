//Referenzvariable = Verweis auf Objekt

public class Referenzvariablen {

	public static void main(String[] args) {
		//[Beispiel Primitive Variable]
		// Der für eine primitive Variable reservierte Speicherbereich enthält direkt den primitiven Wert, der der Variable zugeordnet werden soll.
		int a = 5;
		int b;
		b = a;
		a = 9;
		
		//System.out.println(a);
		//System.out.println(b);

		//[Beispiel Referenzvariable]
		// Der für eine Referenzvariable reservierte Speicherbereich enthält eine Referenz. 
		// Diese Referenz verweist auf den Speicherbereich im Heap, an dem das Objekt gespeichert ist, auf das die Variable verweisen soll.
		Kuh Bertha = new Kuh();
		Kuh Frieda = new Kuh();
		Kuh Lena = new Kuh();
		
		Bertha.geburtsdatum = "24.12.2023";
		Frieda.geburtsdatum = "1.1.2020";
		Lena.geburtsdatum = "5.4.2010";

		Frieda = Bertha; //Frieda und Bertha verweisen auf gleiches Objekt/gleiche Kuh-Eigenschaften/gleichen Speicherinhalt (Speicheradresse)
		Bertha = Lena;

		Bertha.geburtsdatum = "30.05.1999";

		System.out.println("Frida: " + Frieda.geburtsdatum);
		System.out.println("Berta: " + Bertha.geburtsdatum);
		System.out.println("Lena: " + Lena.geburtsdatum);
	}

}
