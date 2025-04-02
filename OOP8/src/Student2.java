// Datei: Student2.java

public class Student2 extends Person2
{
   private int matrikelnummer;

   public Student2 (String vorname, String nachname, int matrikelnummer)
   {
	   super(nachname, vorname);
	   this.matrikelnummer = matrikelnummer;
   }

   public void print()
   {
      System.out.println ("Nachname: " + nachname);
      System.out.println ("Vorname: " + vorname);
      System.out.println ("Matr. Nr: " + matrikelnummer);
   }
}
