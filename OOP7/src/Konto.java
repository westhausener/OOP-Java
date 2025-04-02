// Datei: Konto.java

public class Konto
{
   private Person person;
   private double kontostand;

   public Konto (String name, String vorname, double kontostand)
   {
      person = new Person(name, vorname);
      this.kontostand = kontostand;
   }

   public double getKontostand()
   {
      return kontostand;
   }

   public void setKontostand (double kontostand)
   {
      this.kontostand = kontostand;
   }

   public String getName()
   {
      return person.getName();
   }

   public void setName (String name)
   {
      person.setName (name);
   }
}
