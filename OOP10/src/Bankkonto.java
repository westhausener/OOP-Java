// Datei: Bankkonto.java

public class Bankkonto {

   private double konto;
   
   public void einzahlen (double betrag) throws TransaktionsException
   {
      if (betrag < 0)
         throw new TransaktionsException("Fehler: negativer Einzahlungsbetrag!");
      
      konto = konto + betrag;
   }
   
   public void auszahlen (double betrag) throws TransaktionsException
   {
      if (betrag < 0)
      {
         throw new TransaktionsException("Fehler: negativer Auszahlungsbetrag!");
      
      }else if(konto-betrag < 0){
    	  
    	  throw new TransaktionsException("Fehler: Konto wird überzogen!");
      }
      
      konto = konto - betrag;
   }
   
   public double getKontostand()
   {
      return konto;
   }
   
}
