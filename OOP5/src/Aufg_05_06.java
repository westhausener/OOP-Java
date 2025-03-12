
public class Aufg_05_06 {

	public static void main(String[] args) {
		
		int tag = Tools.intEingabe();
				
		switch(tag){
		
			case 1: 		
			case 2: 		
			case 3: System.out.println("erste Wochenhälfte");
			break;
			case 4: 			
			case 5: System.out.println("zweite Wochenhälfte");
			break;
			case 6: 
			case 7: System.out.println("Wochenende");
			break;
			default: System.out.println("falsche Eingabe");
		}
		
	}

}
