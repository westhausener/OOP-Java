
public class Film {

	private String figur;
	private String titel;
	private int jahr;
	
	// Konstruktor mit Figur, Titel und Jahr
	public Film(String titel, String figur, int jahr){
		this.figur = figur;
		this.titel = titel;
		this.jahr = jahr;
	}
	
	// überladener Konstruktor ohne Parameter
	// ruft den anderen auf mit "kein Titel",
	// "keine Figur", 0
	public Film(){
		this("kein Titel", "Keine Figur", 0);
	}
	
	
	// print-Methode
	public void print(){
		System.out.println("Titel: "+titel);
		System.out.println("Figur: "+figur);
		System.out.println("Jahr: "+jahr);
		System.out.println("-----------------------");
	}
}
