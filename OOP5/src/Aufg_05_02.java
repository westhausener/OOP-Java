
public class Aufg_05_02 {

	public static void main(String[] args) {
		
		int punkte = Tools.intEingabe();
		String note;
		
		if(punkte==10)
			note = "sehr gut";
		else if(punkte==9)
			note = "gut";
		else if(punkte==8)
			note = "befriedigend";
		else if(punkte==7)
			note = "ausreichend";
		else if(punkte<7)
			note = "ungenügend";
		else
			note = "keine (falsche Eingabe)";
		
		System.out.println("Note: "+note);

	}

}
