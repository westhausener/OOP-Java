
public class Bierfass {

	private String sorte;
	private int liter;
	private int fassId;
	private static int anzahlFaesser;
	private static int literGesamt;
	
	public Bierfass(String sorte, int liter) {
		
		this.sorte = sorte;
		this.liter = liter;
		this.fassId = ++anzahlFaesser;
		literGesamt+=liter;
	}

	
	public void zapfen(int liter){
		this.liter-=liter;
		literGesamt-=liter;
	}
	
	public void print(){
		System.out.println("Bierfass Nr. "+this.fassId+":");
		System.out.println("Sorte: "+this.sorte);
		System.out.println("Liter aktuell: "+this.liter);
		System.out.println("-------------------------------------------");
	}


	public static int getAnzahlFaesser() {
		return anzahlFaesser;
	}


	public static int getLiterGesamt() {
		return literGesamt;
	}
	
	
	
}
