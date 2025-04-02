// Datei: Pumpe.java

public class Pumpe extends Produkt
{
   protected float maximalerBetriebsdruck;
   protected int maximaleFoerdermenge;
   
   
   
   
   
   
   // Konstruktor
   public Pumpe(float mb, int mf, String name, int tiefe, int hoehe, int gewicht, int breite){
	   
	   super(name, tiefe, hoehe, gewicht, breite);
	   this.maximalerBetriebsdruck = mb;
	   this.maximaleFoerdermenge = mf;
	   
	   
   }
   
}
