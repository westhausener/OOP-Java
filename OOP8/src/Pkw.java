// Datei: Pkw.java

class Pkw extends Fahrzeug{
	
   private String modellBezeichnung;

   public Pkw(){
	   
      // Aufruf des Konstruktors der Basisklasse mit der Farbe grün
      super("grün");

      System.out.print("Geben Sie die Modellbezeichnung ein: ");
      modellBezeichnung = Tools.stringEingabe();
   }

   public void print(){
	   
      super.print();

      System.out.println("Modellbezeichnung: "+modellBezeichnung);
   }

   public void losfahren(){
         System.out.println("Der PKW fährt los und schaltet das Radio dabei an!");
   }
}