package OOP3;

public class AutoMain {

	public static void main(String[] args) {


		Auto a1 = new Auto();
		a1.ps = 1524;
		a1.hersteller = "VW";
		Auto.anzahl++;


		Auto a2 = new Auto();
		a2.ps = 45;
		a2.hersteller = "BYD";
		Auto.anzahl++;

		System.out.println("Anzahl Autos: " + Auto.anzahl);
		System.out.println("Auto 1: " + a1.hersteller + " " + a1.ps);
		System.out.println("Auto 2: " + a2.hersteller + " " + a2.ps);
	}
}
