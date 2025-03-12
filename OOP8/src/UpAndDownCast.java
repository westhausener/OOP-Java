
public class UpAndDownCast {

	public static void main(String[] args) {

		Auto a1 = new Auto();
		
		
		// Upcast
		Fortbewegungsmittel f1 = a1;
		
		// Zugriff auf ps und isCabrio nicht möglich
		//System.out.println("PS: "+f1.);
		
		// Nach dem Downcast ist das wieder möglich
		Auto a2 = (Auto) f1;
		
		System.out.println("PS: "+a2.ps);
		
		
	}

}

class Fortbewegungsmittel{
	
	int id;
	String hersteller;
	
}

class Auto extends Fortbewegungsmittel{
	
	int ps;
	boolean isCabrio;
	
}
