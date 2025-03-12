package OOP10;

public class Nullteiler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int zahler = 64;
		int nenner = 0;
		
		try {
			double ergebnis = zahler / nenner;
			
			System.out.println("Das Ergebnis ist: " + ergebnis);
			
		}
		
		catch (ArithmeticException e) {
			System.out.println("Deine Eingaben: " + zahler + ", " + nenner + "führten zu einer Eception");
		}
		
		
		

	}

}
