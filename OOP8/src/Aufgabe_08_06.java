
public class Aufgabe_08_06 {

	public static void ausgabeTier(Tier t){
	
		//t.print();
		
		System.out.println("Tierart: "+t.getClass().getName());
		System.out.println("ID: "+t.getId());
		System.out.println("Groesse: "+t.getGroesse()+" cm");
		System.out.println("Gewicht: "+t.getGewicht()+" kg");
		
		if(t instanceof Elefant){
			System.out.println("Rüssellänge: "+((Elefant) t).getRuessellaenge()+" cm\n");
		}
		
		if(t instanceof Giraffe){
			System.out.println("Halslänge: "+((Giraffe) t).getHalslaenge()+" cm\n");
		}
		
	}
	
	public static void main(String[] args) {
		
		Elefant e = new Elefant(180, 1, 305, 5500);
		Giraffe g =  new Giraffe(245, 2, 503, 1200);
		
		ausgabeTier(e);
		ausgabeTier(g);

	}

}


