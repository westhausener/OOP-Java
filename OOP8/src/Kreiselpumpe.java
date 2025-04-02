// Datei: Kreiselpumpe.java

public class Kreiselpumpe extends Pumpe
{
   
    private int anzahlSchaufeln;
    private int maximaleDrehzahl;
   
   
   
   // Konstruktor
   public Kreiselpumpe(int as, int md, float mb, int mf, String name, int tiefe, int hoehe,
			int gewicht, int breite) {
		super(mb, mf, name, tiefe, hoehe, gewicht, breite);
		this.anzahlSchaufeln = as;
		this.maximaleDrehzahl = md;
		
	}
}
