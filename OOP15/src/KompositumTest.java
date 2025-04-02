// Datei: KompositumTest.java

import javax.swing.*;
import java.awt.FlowLayout;

public class KompositumTest
{
   public static void main (String[] args)
   {
      // Fuer das Objekt vom Typ JFrame wird die Container-Funktio-
      // nalitaet genutzt.
      JFrame frame = new JFrame ("Hauptfenster");

      JLabel label = new JLabel ("Name:");
      JTextField textfield = new JTextField (20);
      JButton button = new JButton ("uebernehmen");

      frame.setLayout (new FlowLayout());

      // Dem Hauptfenster werden durch Aufruf der Methode add() die
      // anderen GUI-Komponenten hinzugefuegt.
      frame.add (label);
      frame.add (textfield);
      frame.add (button);
 
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible (true);
   }
}
