// Datei: Bankkonto.java

public class Bankkonto {

   private double konto;
   
   public void einzahlen (double betrag) throws TransaktionsException {
	   if ( betrag < 0) {
		   throw new TransaktionsException("Betrag ist negativ");
   }
	   konto = konto + betrag;
   }
   
 
   public void auszahlen (double betrag) throws TransaktionsException
   {
	   if (betrag < 0) {
		   throw new TransaktionsException("Betrag ist negativ");
	   }
	   else if (betrag > konto) {
		   throw new TransaktionsException();
	   }
	   konto = konto - betrag;
   }
   
   public double getKontostand()
   {
      return konto;
   }
   
}
