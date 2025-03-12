
public class Aufg_05_08 {
	
	
	public static void main(String[] args) {

		String[][] nameArray = new String[5][2];
		
		/** Einlesen der Namen */
		for(int i=0; i<5; i++){
			
			String fullName = Tools.stringEingabe();
			//nameArray[i] = fullName.split(" ");
			
			String[] s = fullName.split(" ");
			nameArray[i] = s;
			//nameArray[i][0] = s[0];
			//nameArray[i][1] = s[1];
			
		}

		System.out.println("--------------------------------------");
		
		
		
		
		/** Ausgeben der Namen */
		for(String[] fullNameArray : nameArray){			
			
			if(fullNameArray[1].length()>4 && fullNameArray[0].toUpperCase().indexOf("E")>=0){
				
				System.out.println("Name: "+fullNameArray[0]+" "+fullNameArray[1]);
			}
		}
	}
}
