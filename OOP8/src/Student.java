// Datei: Student.java

public class Student extends Person  // die Klasse Student wird von
{                                    						  // der Klasse Person abgeleitet
   private int matrikelnummer;
  
   // Methoden der Klasse Student
   public void setMatrikelnummer (int matrikelnummer)
   {
	   this.matrikelnummer = matrikelnummer;     
   }

   public void printMatrikelnummer()
   {       
	   System.out.println ("Matrikelnummer: " + matrikelnummer);
	   
   }
}
