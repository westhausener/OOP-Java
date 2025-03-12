
public class Aufg_05_08_simple {
	
	
	public static void main(String[] args) {
		
		String[] nameArray = new String[5];
		
		/** Einlesen der Namen */
		for(int i=0; i<5; i++){
			
			nameArray[i] = Tools.stringEingabe();
		}
		
		// Das liefert später eine Nullpointer-Exception (also so nicht einlesen!!!)
		/*for(String element : nameArray){
			element = Tools.stringEingabe();
		}*/

		System.out.println("--------------------------------------");
		
		/** Ausgeben der Namen */
		for(String name : nameArray){			
			
			if(name.length()>4 && name.toUpperCase().indexOf("E")>-1){
			
				System.out.println("Name: "+name);
			}
		}
	}
}
