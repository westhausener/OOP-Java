
public class Giraffe extends Tier{
	private int halslaenge;
	
	public Giraffe(int halslaenge, int id, int groesse, int gewicht){
		super(id, groesse, gewicht);
		this.halslaenge = halslaenge;
	}

	public int getHalslaenge() {
		return halslaenge;
	}
	
	public void print(){
		super.print();
		System.out.println("Bin eine Giraffe.");
	}
	
}