public class Oldtimer implements Fahrzeug, Sammlerstueck
{
    public static void main(String[] args) {
       
    		Oldtimer o = new Oldtimer();
    		o.beschleunigen();
    		o.testen();
    }

	@Override
	public void beschleunigen() {
		System.out.println("Gas geben.");
	}
	
	public void testen(){
		Fahrzeug.super.testen();
		Sammlerstueck.super.testen();
	}
	
}
//-------------------------------------------------------------------------------------------
interface Fahrzeug {
	
	public  void beschleunigen();
	
	default public void testen(){
		System.out.println("Fahrzeug-Test");
	}
}
 
//-------------------------------------------------------------------------------------------
interface Sammlerstueck {
	
	default public void testen(){
		System.out.println("Sammlerstück-Test");
	}
}









