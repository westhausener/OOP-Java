// Datei: Person2.java

public class Person2
{
   protected String nachname;
   protected String vorname;
   
   public Person2 (String nachname, String vorname)
   {
      this.nachname = nachname;
      this.vorname = vorname;
   }

   public void print()
   {
      System.out.println ("Nachname: " + nachname);
      System.out.println ("Vorname: " + vorname);
   }
}
