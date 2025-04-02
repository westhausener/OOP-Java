// Datei: Fahrzeug.java

class Fahrzeug{
	
   private double preis;
   private String herstellerName;
   private String farbe;

   public Fahrzeug(String farbe){
	   
      this.farbe = farbe;      

      System.out.print("\nGeben Sie den Herstellernamen ein: ");
      herstellerName = Tools.stringEingabe();

      System.out.print("Geben Sie den Preis ein: ");
      preis = Tools.doubleEingabe();
      
   }

   public void print(){
	   
      System.out.println();
      System.out.println("Herstellername   : " + herstellerName);
      System.out.println("Preis            : " + preis);
      System.out.println("Farbe   : " + farbe);
   }
}