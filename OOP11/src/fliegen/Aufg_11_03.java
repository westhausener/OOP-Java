package fliegen;

public class Aufg_11_03 {

	public static void main(String[] args) {
	
		Biene maja = new Biene();
		Vogel v = new Vogel();
		
		abflug(maja);
		abflug(v);
	}
	
	
	private static void abflug(Fliegen f){	
		
		f.fliegen();
	}
	
	
}
