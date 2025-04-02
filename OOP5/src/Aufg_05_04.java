
public class Aufg_05_04 {

	public static void main(String[] args) {
		
		int punkte = Tools.intEingabe();
		String note;
		
		switch(punkte){
		
			case 10: note = "sehr gut";
			break;
			case 9: note = "gut";
			break;
			case 8: note = "befriedigend";
			break;
			case 7:note = "ausreichend";
			break;
			case 6:
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0: note = "ungen�gend";
			break;
			default: note = "keine (falsche Eingabe)";
		}
		
		System.out.println("Note: "+note);

	}

}
