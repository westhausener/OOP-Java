// Datei: Student3.java  

public class Student3 extends Person2
{
   private int matrikelnummer;

   public Student3 (String vorname, String nachname, int matrikelnummer)
   {
	 super(nachname, vorname);
	  this.matrikelnummer = matrikelnummer;
      
   }

   public void print()
   {
      super.print();
      System.out.println ("Matr. Nr: " + matrikelnummer);
   }
}
