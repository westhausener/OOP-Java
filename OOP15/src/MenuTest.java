
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuTest extends JFrame implements ActionListener
{
	private JMenuItem exitItem;
   
	public MenuTest(){
		super("JMenuBar-Test");
		
		// Definieren, was beim Schließen des Fensters geschehen soll.
	    setDefaultCloseOperation (EXIT_ON_CLOSE);
	      
	    // Neues Menu erzeugen.
	    JMenuBar menuBar = new JMenuBar();
	    // Menu an Frame anhängen.
	    setJMenuBar (menuBar);

	    // Untermenü "Datei" erzeugen.
	    JMenu fileMenu = new JMenu ("Datei");
	    // Untermenü an Menu anhängen.
	    menuBar.add (fileMenu);
	       
	    // Untermenü "Schließen" erzeugen.
	    exitItem = new JMenuItem ("Schließen");
	    exitItem.addActionListener(this);
	    
	    // Untermenü an Untermenü "Datei" anhängen.
	    fileMenu.add (exitItem);
	       
	    // Fenstergröße setzen.
	    setSize (410, 200);
	    // Fenster anzeigen.
	    setVisible (true);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exitItem)
			System.exit(0);
		
	}

	public static void main (String[] args)
	{
	      new MenuTest();
	      
	}
 
}