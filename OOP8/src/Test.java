// Datei: Test.java

public class Test
{
   public static void main (String[] args)
   { 
      System.out.println ("Student");
      Student s = new Student(); 
      s.setNachname ("Maier");
      s.setVorname ("Fritz");
      s.setMatrikelnummer (56123);
      s.print();
      s.printMatrikelnummer();

      System.out.println ("Person");
      Person pers = new Person();
      pers.setNachname ("Mueller");
      pers.setVorname ("Peter");
      pers.print();
   }
}
