// Datei: TestBankkonto.java

public class TestBankkonto
{
   public static void main (String[] args)
   {
      Bankkonto konto = new Bankkonto();
      double betrag;
      System.out.println ("Kontostand: " + konto.getKontostand());
      
      try
      {
         betrag = 123.45;
         System.out.println();
         System.out.println ("Einzahlung: " + betrag);
         konto.einzahlen (betrag);
         System.out.println ("Kontostand: " + konto.getKontostand());
      }
      catch (TransaktionsException ex)
      {
         System.out.println (ex.getMessage());
      }

      try
      {
         //Negative Einzahlung
         betrag = -12.45;
         System.out.println();
         System.out.println ("Einzahlung: " + betrag);
         konto.einzahlen (betrag);
         System.out.println ("Kontostand: " +  konto.getKontostand());
      }
      catch (TransaktionsException ex)
      {
         System.out.println (ex.getMessage());
      }
      
      try
      {
         //Negative Auszahlung
         betrag = -12.45;
         System.out.println();
         System.out.println ("Auszahlung: " + betrag);
         konto.auszahlen (betrag);
         System.out.println ("Kontostand: " + konto.getKontostand());
      }
      catch (TransaktionsException ex)
      {
         System.out.println (ex.getMessage());
      }

      try
      {
         betrag = 12;
         System.out.println();
         System.out.println ("Auszahlung: " + betrag);
         konto.auszahlen (betrag);
         System.out.println ("Kontostand: " + konto.getKontostand());
      }
      catch (TransaktionsException ex)
      {
         System.out.println (ex.getMessage());
      }

      try
      {
         //Konto Ueberziehen
         betrag = 130;
         System.out.println();
         System.out.println ("Auszahlung: " + betrag);
         konto.auszahlen (betrag);
         System.out.println ("Kontostand: " + konto.getKontostand());
      }
      catch (TransaktionsException ex)
      {
         System.out.println (ex.getMessage());
      }
   }
}
