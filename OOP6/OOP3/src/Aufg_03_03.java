
public class Aufg_03_03 {
	
	public static void main(String[] args) {
		
		String[] sArray = new String[3];
		
		sArray[0] = "Anna";
		sArray[1] = "Petra";
		sArray[3] = "Josephine";
		
		
		System.out.println(sArray[0].charAt(0)+". ");
		// oder
		System.out.println(sArray[0].substring(0,1)+".");
		
		System.out.println("Länge: "+sArray[1].length());
		
		System.out.println(sArray[2].toUpperCase());

	}

}
