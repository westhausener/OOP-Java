
public class AutoMain {

	public static void main(String[] args) {
		
		Auto a1, a2;
		
		a1 = new Auto();
		Auto.anzahl++;
		a2 = new Auto();
		Auto.anzahl++;
		
		a1.hersteller = "VW";
		a1.ps = 150;
		
		a2.hersteller = "Ford";
		a2.ps = 39;
		
		System.out.println("Hersteller: "+a1.hersteller);
		System.out.println("PS: "+a1.ps + " Test");
		System.out.println("Hersteller: "+a2.hersteller);
		System.out.println("PS: "+a2.ps);
		System.out.println("Anzahl: "+Auto.anzahl);
		
	}

}
