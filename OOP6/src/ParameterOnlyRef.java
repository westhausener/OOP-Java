// Datei: Parameter.java  

class Auto
{
   int ps;
}
//--------------------------------------------------------------------------------------------------------------

public class ParameterOnlyRef
{

   public static void methode (Auto a1)
   {                 
      a1.ps = 200;
   }

   public static void main (String[] args){
	   
      Auto meinAuto = new Auto();
      meinAuto.ps = 100;

      System.out.println ("Datenfeld vor Aufruf : " + meinAuto.ps);
      methode (meinAuto);
      System.out.println ("Datenfeld nach Aufruf: " + meinAuto.ps);
   }
}
