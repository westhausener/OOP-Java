
class Kuh
{
   int x;
}

//--------------------------------------------------------------------------------

public class Parameter
{
   public static void methode1 (int par)
   {
      par = 2;       // Aenderung an der Kopie
   }

   public static void methode2 (Kuh k1)
   {                 // Aenderung an dem Datenfeld x des Objektes,
      k1.x = 2; // auf das k1 zeigt
   }

   public static void main (String[] args){
	   
      int var = 1;
      Kuh meineKuh = new Kuh();  

      meineKuh.x = 1;

      System.out.println ("aktueller Parameter vor Aufruf : "+ var);
      methode1 (var);
      System.out.println ("aktueller Parameter nach Aufruf: "+ var);

      System.out.println ("Datenfeld vor Aufruf : " + meineKuh.x);
      methode2 (meineKuh);
      System.out.println ("Datenfeld nach Aufruf: " + meineKuh.x);
   }
}
