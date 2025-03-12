// Datei: CardLayoutTest.java

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Aufg_15_10 extends JFrame implements ActionListener
{
   JLabel label;
   JMenuItem c1, c2, c3, exit; 
	   
   public Aufg_15_10(){
	   
	   super("Aufgabe 15.10");
	   	   	  	
	   // Neue Menüzeile erzeugen.
	   JMenuBar menuBar = new JMenuBar();
	   setJMenuBar(menuBar);

	   // Menüs "Datei" und "Karten" erzeugen.
	   JMenu fileMenu = new JMenu("Datei");
	   JMenu cardMenu = new JMenu("Karten");
	   
	   // Menüs an Menubar anhängen.
	   menuBar.add(fileMenu);
	   menuBar.add(cardMenu);
	       
	   // Untermenüs erzeugen und ActionListener hinzufügen
	   exit = new JMenuItem("schließen");
	   exit.addActionListener(this);
	   
	   c1 = new JMenuItem("Karte 1");
	   c1.addActionListener(this);
	   c2 = new JMenuItem("Karte 2");
	   c2.addActionListener(this);
	   c3 = new JMenuItem("Karte 3");
	   c3.addActionListener(this);
	   
	   fileMenu.add(exit);
	   cardMenu.add(c1);
	   cardMenu.add(c2);
	   cardMenu.add(c3);
	   
	   // Label hinzufügen
	   add(label = new JLabel("---"), BorderLayout.CENTER);

	   setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	   setSize(200,200);
	   setVisible (true);
   }
   

   public void actionPerformed (ActionEvent e)
   {      
       // Abhaengig davon, welcher Menüpunkt gedrueckt wurde,
       // wird die zugehoerige Karte angezeigt.   
	   // label.setText("Ich bin "+e.getActionCommand());
	   // oder das Programm beendet.
	   if(e.getSource() == exit) {
		   System.exit(0);
	   }else {
		   label.setText("Ich bin "+e.getActionCommand());
	   }
   }
   
   public static void main (String[] args)
   {      
      new Aufg_15_10();
      
   }
}