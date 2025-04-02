
public class Aufg_05_03 {

	public static void main(String[] args) {
		
		int zahl1 = Tools.intEingabe();
		int zahl2 = Tools.intEingabe();
		int zahl3 = Tools.intEingabe();
		
		
		
		if(zahl2<zahl1)
			zahl1 = zahl2;
		
		if(zahl3<zahl1)
			zahl1 = zahl3;
		
		System.out.println("Die kleinste Zahl lautet "+zahl1);

	}

}
