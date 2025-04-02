import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JColorChooserDemo extends JFrame implements ActionListener
{
  private JButton b;	

  public JColorChooserDemo(){
	  super("Farb-Button");
	  b = new JButton( "Farbe ändern" );
	  add( b );
	  b.addActionListener(this); 
	  
	  pack();
	  setDefaultCloseOperation( EXIT_ON_CLOSE );
	  setVisible( true );
  }
	
	public static void main( String[] args )
  {
	  new JColorChooserDemo();
  }


  public void actionPerformed(ActionEvent e) {
	
	  Color newColor = JColorChooser.showDialog( this, 	// Vaterkomponente
			  "Wähle neue Farbe",						// Anzeigetext
			  Color.BLACK );					// Startfarbe
	  
	  b.setBackground( newColor );
  }
}