// Datei: Membranpumpe.java

public class Membranpumpe extends Pumpe
{   

    private String membranmaterial;
 
    
    
    
    // Konstruktor
    public Membranpumpe(String mm, float mb, int mf, String name, int tiefe, int hoehe, int gewicht, int breite) {
		super(mb, mf, name, tiefe, hoehe, gewicht, breite);
		this.membranmaterial = mm;
	}

}
