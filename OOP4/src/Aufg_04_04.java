
public class Aufg_04_04 {

	public static void main(String[] args) {
		
		int sekunden=0, minuten=0, stunden=0, tage=0;
				
		sekunden = Tools.intEingabe();
		
		// Berechnungen mit arithmetischen Operatoren
		tage=sekunden/(24*60*60);
		sekunden=sekunden%(24*60*60);
		stunden=sekunden/(60*60);
		sekunden=sekunden%(60*60);
		minuten=sekunden/60;
		sekunden=sekunden%60;
				
		System.out.println("Das sind");
		System.out.println(tage + " Tage");
		System.out.println(stunden + " Stunden");
		System.out.println(minuten + " Minuten");
		System.out.println(sekunden + " Sekunden");
		

	}

}
