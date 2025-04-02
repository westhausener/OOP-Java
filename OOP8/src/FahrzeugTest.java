// Datei: FahrzeugTest.java

public class FahrzeugTest{
	
   public static void main (String args[]){

      // Einen PKW erzeugen
      System.out.println ("Pkw");
      
      Pkw pkw1 = new Pkw();

      // Ein Motorrad erzeugen
      System.out.println ("Motorrad");
      
      Motorrad m1 = new Motorrad();

      //Rufen Sie die print-Methoden der beiden Fahrzeuge auf
      pkw1.print();
      m1.print();
   

   }
}