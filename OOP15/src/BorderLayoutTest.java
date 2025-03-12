// Datei: BorderLayoutTest.java

import javax.swing.*;
import java.awt.BorderLayout;

public class BorderLayoutTest extends JFrame
{
   public static void main (String[] args){
	   new BorderLayoutTest();
   }
   
   public BorderLayoutTest(){
      super ("Layout-Manager: Border-Layout");

      // Fuer ein Hauptfenster vom Typ JFrame ist der Layout-Manager
      // Border-Layout bereits voreingestellt.
      // Beim Aufruf der Methode add() wird als zweiter Parameter
      // die Randbedingung zur Positionierung uebergeben.
      add (new JButton ("OBEN"), BorderLayout.NORTH);
     add (new JButton ("UNTEN"), BorderLayout.SOUTH);
      add (new JButton ("LINKS"), BorderLayout.WEST);
      add (new JButton ("RECHTS"), BorderLayout.EAST);
      add (new JButton ("MITTE"), BorderLayout.CENTER);
 
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      // Optimale Fenstergroesse ermitteln und setzen.
      pack();
      setVisible (true);
   }
}
