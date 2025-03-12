
public class Aufg_03_01 {

	
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Super Java!");
		StringBuffer sb2 = new StringBuffer("30");
		
		StringBuffer sb3 = sb1;
		System.out.println(sb3);
		//-------------------------------------------------------------------------
		
		int summe = 20 + Integer.parseInt(sb2.toString());
		
		System.out.println("Summe: "+summe);
		//-------------------------------------------------------------------------
		
		sb2.append(" Grad warmes Wasser");
		sb3 = sb2;
		System.out.println(sb3);
		
	}

}
