package OOP2;


public class Kuh{
    
	public int gewicht;
	public String geburtsdatum;
	public boolean schwanger;
	public String stall;
	public static int anzahl;
	

	public void print(String s){
        System.out.println("Ausgabe: "+s);
	}
    public int wieAlt() {
    	return 5 ;// Berechne aus dem Geburtsdatum das Alter
    }
    
    public boolean isSchwanger() {
    	return schwanger;
    	
    }
    
    public String welcherStall() {
    	return stall;
    }
    
    public int wieSchwer() {
    	return gewicht;
    }
    
}