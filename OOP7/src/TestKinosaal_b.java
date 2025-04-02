// Datei: TestKinosaal_b.java

public class TestKinosaal_b
{
   public static void main(String[] args)
   {
      Kinosaal_b saal1 = new Kinosaal_b();
      saal1.setAnzahlSitzplaetzeSaal(50);
      
      System.out.println("Anzahl Kinosaele:       "+Kinosaal_b.getAnzahlKinosaele());
      System.out.println("Anzahl Kinositzplaetze: "+Kinosaal_b.getAnzahlSitzplaetzeKino());

      Kinosaal_b saal2 = new Kinosaal_b();
      saal2.setAnzahlSitzplaetzeSaal(150);
      
      System.out.println("Anzahl Kinosaele:       "+Kinosaal_b.getAnzahlKinosaele());
      System.out.println("Anzahl Kinositzplaetze: "+Kinosaal_b.getAnzahlSitzplaetzeKino());

      System.out.println("\nUmbau des Kinosaals 1 von 50 auf 60 Plaetze");
      saal1.setAnzahlSitzplaetzeSaal(60);
      System.out.println("Anzahl Kinosaele:       "+Kinosaal_b.getAnzahlKinosaele());
      System.out.println("Anzahl Kinositzplaetze: "+Kinosaal_b.getAnzahlSitzplaetzeKino());
   }
}
