public class Berechnung{

	public static void main(String[] args){
	
		int[] myArray = {1,2,3,4,5,0,7};
	
			try {
				System.out.println("Mittelwert = "+berechneMittelwert(myArray));
			} catch (ZeroException e) {
				System.err.println(e.getMessage());
			}
		
	}
	
	public static double berechneMittelwert(int[] werte) throws ZeroException {
		
		int summe = 0;
		
		for(int i=0; i<werte.length; i++){
			
			// wenn ein Wert des Arrays 0 ist, die ZeroException schmeissen
			if(werte[i] == 0){
				throw new ZeroException();
			}
			
			summe += werte[i];
		}
		
		return (double)summe/werte.length;
	}
	
}