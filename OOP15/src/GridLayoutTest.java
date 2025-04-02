// Datei: GridLayoutTest.java

import javax.swing.*;
import java.awt.GridLayout;

public class GridLayoutTest extends JFrame
{
   public static void main (String[] args)
   {
	   new GridLayoutTest();
   }
   
   public GridLayoutTest(){
	   
     super("Layout-Manager: Grid-Layout");

      // Layout-Manager setzen. Es wird ein Grid-Layout mit 3 Zeilen
      // (1. Parameter) und 2 Spalten (2. Parameter) verwendet.
      setLayout (new GridLayout (3, 2));

      // Die hinzugefuegten GUI-Komponenten werden nach den Regeln
      // des Layout-Managers angeordnet.
      add (new JButton ("Zeile: 1 / Spalte: 1"));
      add (new JButton ("Zeile: 1 / Spalte: 2"));
      add (new JButton ("Zeile: 2 / Spalte: 1"));
      add (new JButton ("Zeile: 2 / Spalte: 2"));
      add (new JButton ("Zeile: 3 / Spalte: 1"));           
 
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      // Optimale Fenstergroesse ermitteln und setzen.
      pack();
      setVisible (true);
   }
}
