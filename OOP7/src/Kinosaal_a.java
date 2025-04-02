// Datei: Kinosaal_a.java

public class Kinosaal_a
{
   private int saalNummer;
   private int anzahlSitzplaetzeSaal;
   private static int anzahlSitzplaetzeKino = 0;
   private static int anzahlKinosaele = 0;

   public Kinosaal_a()
   {
      anzahlKinosaele++;
      saalNummer = anzahlKinosaele;
   }

   public int getAnzahlSitzplaetzeSaal()
   {
      return anzahlSitzplaetzeSaal;
   }

   public void setAnzahlSitzplaetzeSaal(int anzahlSitzplaetzeSaal)
   {
      this.anzahlSitzplaetzeSaal = anzahlSitzplaetzeSaal;
      anzahlSitzplaetzeKino += anzahlSitzplaetzeSaal;
   }

   public static int getAnzahlSitzplaetzeKino()
   {
      return anzahlSitzplaetzeKino;
   }

   public static int getAnzahlKinosaele()
   {
      return anzahlKinosaele;
   }

   public int getSaalNummer()
   {
      return saalNummer;
   }
}
