// Datei: Auffangbecken.java

public class Auffangbecken extends Produkt
{
    private int volumen;
 
    
    
    
    
    // Konstruktor
    public Auffangbecken(int v, String name, int tiefe, int hoehe, int gewicht, int breite) {
		super(name, tiefe, hoehe, gewicht, breite);
		this.volumen = v;
	}
}
