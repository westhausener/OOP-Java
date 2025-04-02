// Datei: Zeichenkette.java

public class Zeichenkette
{
   public static void main (String[] args)
   {
      String buchtitel = "Java als erste Programmiersprache";
      String buchtitelAnfang;
      System.out.println (buchtitel);
      System.out.println ("Anzahl der Zeichen des Buchtitels: " + buchtitel.length());
      
      // Zuweisung eines Teilstrings an buchtitelAnfang
      buchtitelAnfang = buchtitel.substring (0, 5);
      System.out.println ("Buchtitel-Anfang: |"+buchtitelAnfang+"|");
      System.out.println ("Anzahl der Zeichen vor trim(): " + buchtitelAnfang.length());

      // Entfernen der Leerzeichen von beiden Enden des Strings
      buchtitelAnfang = buchtitelAnfang.trim();
      System.out.println ("Anzahl der Zeichen nach trim(): " + buchtitelAnfang.length());

      if (buchtitelAnfang.equals ("Java"))
      { 
         System.out.println ("Buchtitel faengt mit Java an");
      }
   }
}
