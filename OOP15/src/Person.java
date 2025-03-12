package fom;

public class Person {

	protected String name;
	protected int alter;
	public static int anzahl;
	
	public void laufen() {
		
	}
}
//-------------------------------------------------------------
interface Schulbesuch{
	void schoenLernen(boolean b);
}
//-------------------------------------------------------------
class Erwachsener extends Person{
	
	private int gehalt;
	public void arbeiten() {
		
	}
}
//-------------------------------------------------------------
class Kind extends Person implements Schulbesuch{
	private int taschengeld;
	public void spielen() {
		
	}
	
	public void schoenLernen(boolean b) {
		
	}
}