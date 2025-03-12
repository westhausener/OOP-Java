
public class ParameterOnlyValue
{

	public static void methode1 (int y)
	   {
	      y = 2;       // Aenderung an der Kopie
	   }

   public static void main (String[] args){
	   
	   int y = 100;
	   
      System.out.println ("Datenfeld vor Aufruf : " + y);
      methode1 (y);
      System.out.println ("Datenfeld nach Aufruf: " + y);
   }
}
