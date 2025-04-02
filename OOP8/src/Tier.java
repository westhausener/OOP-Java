
public class Tier{
	
	protected int id, groesse, gewicht;
	
	public Tier(int id, int groesse, int gewicht){
		this.id = id;
		this.groesse = groesse;
		this.gewicht = gewicht;
	}

	public int getId() {
		return id;
	}

	public int getGroesse() {
		return groesse;
	}

	public int getGewicht() {
		return gewicht;
	}
	
	public void print(){
		System.out.println("Bin ein Tier.");
	}
	
}