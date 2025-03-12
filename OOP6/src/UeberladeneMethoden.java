// Aufgabe 06.06
// Datei: UeberladeneMethoden.java

public class UeberladeneMethoden
{
   public static void main (String [] args)
   {
      int intSumme = 0;
      int a = 1;
      int b = 2;
      double doubleSumme = 0.0;
      double c = 1.5;
      double d = 0.25;

      
      intSumme = Taschenrechner.addiere (a, b);
      System.out.println (a + " + " + b + " = " + intSumme);

      doubleSumme = Taschenrechner.addiere (c, d);
      System.out.println (c + " + " + d + " = " + doubleSumme);
   }
}

class Taschenrechner
{
   public static int addiere (int a, int b)
   {
      return a + b;
   }

   public static double addiere (double a, double b)
   {
      return a + b;
   }
}
