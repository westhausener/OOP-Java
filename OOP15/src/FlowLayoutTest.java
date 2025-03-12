// Datei: FlowLayoutTest.java

import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class FlowLayoutTest extends JFrame
{
	public static void main (String[] args){ new FlowLayoutTest(); }
	
	public FlowLayoutTest(){

			super ("Layout-Manager: Flow-Layout");

			// Layout-Manager setzen.
			setLayout (new FlowLayout(FlowLayout.LEFT));

			// Die hinzugefuegten GUI-Komponenten werden nach den Regeln
			// des Layout-Managers angeordnet.
			JButton b1 = new JButton ("1");
			//b1.setPreferredSize(new Dimension(800,300));
			add (b1);
			add (new JButton ("2"));
			add (new JButton ("3"));
			add (new JButton ("4"));

			setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

			// Optimale Fenstergroesse ermitteln und setzen.
			pack();
			setVisible (true);
		}
	}
