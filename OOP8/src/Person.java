// Datei: Person.java

public class Person
{
   protected String nachname;
   protected String vorname;

   public void setNachname (String nachname)
   {
      this.nachname = nachname;
   }

   public void setVorname (String vorname)
   { 
      this.vorname = vorname;
   }

   public void print()
   {
      System.out.println ("Nachname: " + nachname);
      System.out.println ("Vorname: " + vorname); 
   }
}
