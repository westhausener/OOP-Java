// Datei: Test3.java

public class Test3
{
   public static void main (String args[])
   {
      Person2 p1 = new Person2 ("Rainer", "Brang");
      System.out.println ("\nAusgabe der Person:");
      p1.print();

      Student3 s1 = new Student3 ("Karl", "Klug", 123456);
      System.out.println ("\nAusgabe des Studenten:");
      s1.print();
   }
}
