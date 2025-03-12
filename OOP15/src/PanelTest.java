// Datei: PanelTest.java

import java.awt.FlowLayout;

import javax.swing.*;

public class PanelTest extends JFrame
{
   public static void main (String[] args)
   {
	   new PanelTest();
   }
   public PanelTest(){
      super("Hauptfenster");
      
      setLayout(new FlowLayout());
      
      // 1. leichtgewichtigen GUI-Container erzeugen und befuellen.
      JPanel panel1 = new JPanel();
      panel1.add (new JLabel ("Name:"));
      panel1.add (new JTextField (30));      

      // 2. leichtgewichtigen GUI-Container erzeugen und befuellen.
      JPanel panel2 = new JPanel();
      panel2.add (new JButton("Gandalf"));
      panel2.add (new JButton("Radagast")); 

      // GUI-Container und -Komponenten in Hauptfenster legen.
      add (panel1);   
      add(panel2);
      
     /* add(new JLabel ("Name:"));
      add(new JTextField (30));
      add(new JButton("Gandalf"));
      add(new JButton("Radagast"));*/

      pack();
      setDefaultCloseOperation (EXIT_ON_CLOSE);
      setVisible (true);
   }
}
