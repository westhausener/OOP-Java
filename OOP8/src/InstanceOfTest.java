
public class InstanceOfTest {

	public static void main(String[] args) {
		
		Object refA = new Grossvater();
		Object refB = new Vater();
		Object refC = new Sohn();
		
		if(refA instanceof Grossvater)
			System.out.println("refA ist Instanz von Grossvater");
		
		if(refB instanceof Grossvater)
			System.out.println("refB ist Instanz von Grossvater");
		
		if(refC instanceof Grossvater)
			System.out.println("refC ist Instanz von Grossvater");

		//-------------------------------------------------
		System.out.println("---------------------------------");
		if(refB instanceof Sohn)
			System.out.println("refB ist Instanz von Sohn");
		else
			System.out.println("refB ist keine Instanz von Sohn");
		
		//-------------------------------------------------
		System.out.println("---------------------------------");
		Sohn sohn = new Sohn();
		// Upcast
		Grossvater grossvater = sohn;
		
		if(grossvater instanceof Sohn)
			System.out.println("grossvater ist Instanz von Sohn");
		else
			System.out.println("grossvater ist keine Instanz von Sohn");
		
		
		// Klasse des Objektes ausgeben
		System.out.println(grossvater.getClass().toString());
	}
}

class Grossvater{
	
}

class Vater extends Grossvater{
	
}

class Sohn extends Vater{
	
}