
public class PolymorphieDemo {

	public static void main(String[] args) {
		Frau f = new Frau();
		Mann m = new Mann();

		f.name = "Chantal";
		f.paarSchuhe = 46;

		m.name = "Peter";
		m.lieblingsVerein = "BVB";

		ausgabe(f);
		ausgabe(m);
		
	}

	public static void ausgabe(Mensch mensch){

		System.out.println("Name: "+mensch.name.toUpperCase());
		
		if(mensch instanceof Frau){
			Frau f = (Frau) mensch;
			System.out.println("Schuhe: "+f.paarSchuhe);
		}
		
		
		
	}

}
//--------------------------------------------------------------------------------------------------------------------------------
class Mensch{
	String name;
}
class Frau extends Mensch{
	int paarSchuhe;
}
class Mann extends Mensch{
	String lieblingsVerein;
}
