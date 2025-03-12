// Datei: Test2.java

public class Test2
{
   public static void main (String[] args)
   {
      Person2 p1 = new Person2 ("Rainer", "Brang");
      System.out.println ("\nAusgabe der Person: ");
      p1.print();
      Student2 s1 = new Student2 ("Karl", "Klug", 123456);
      System.out.println ("\nAusgabe des Studenten: ");
      s1.print();
   }
}
