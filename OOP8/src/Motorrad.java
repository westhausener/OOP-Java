// Datei: Motorrad.java

class Motorrad extends Fahrzeug{
	
   private int spassFaktor;

   public Motorrad(){
       // Aufruf des Konstruktors der Basisklasse mit der Farbe Gelb
       super("gelb");

       System.out.print("Geben Sie den Spaßfaktor ein: ");
       spassFaktor = Tools.intEingabe();
   }
   
   public void print(){
	   
      super.print();
      System.out.println("Spaßfaktor: "+spassFaktor);
   }
}