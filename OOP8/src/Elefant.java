
public class Elefant extends Tier{
	private int ruessellaenge;
	
	public Elefant(int ruessellaenge, int id, int groesse, int gewicht){
		super(id, groesse, gewicht);
		this.ruessellaenge = ruessellaenge;
	}

	public int getRuessellaenge() {
		return ruessellaenge;
	}
	
	public void print(){
		super.print();
		System.out.println("Elefant");
	}
	
}
