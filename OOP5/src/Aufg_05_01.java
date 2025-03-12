
public class Aufg_05_01 {

	public static void main(String[] args) {
		
		int alter = Tools.intEingabe();
		
		if(alter<18)
			System.out.println("Kind/Jugendlicher");
		else if(alter>=18 && alter<65)
			System.out.println("Erwachsener");
		else if(alter>=65)
			System.out.println("Rentner");

	}

}
