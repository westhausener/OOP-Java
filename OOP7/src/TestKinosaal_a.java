// Datei: TestKinosaal_a.java

public class TestKinosaal_a
{
   public static void main(String[] args)
   {
      Kinosaal_a saal1 = new Kinosaal_a();
      saal1.setAnzahlSitzplaetzeSaal(50);
      
      System.out.println("Anzahl Kinosaele:       "+Kinosaal_a.getAnzahlKinosaele());
      System.out.println("Anzahl Kinositzplaetze: "+Kinosaal_a.getAnzahlSitzplaetzeKino());

      Kinosaal_a saal2 = new Kinosaal_a();
      saal2.setAnzahlSitzplaetzeSaal(100);
      
      System.out.println("Anzahl Kinosaele:       "+Kinosaal_a.getAnzahlKinosaele());
      System.out.println("Anzahl Kinositzplaetze: "+Kinosaal_a.getAnzahlSitzplaetzeKino());
   }
}
