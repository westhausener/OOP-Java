// Swing-GUI-Komponenten befinden sich im Paket javax.swing
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

public class PaintDemo extends JFrame
{
	public static void main (String[] args){

		new PaintDemo("Paint-Demo");
	}

	public PaintDemo(String titel){

		super(titel);
		
		add(new MyJPanel());

		// Größe des Fensters
		setSize (600, 400);   
		setDefaultCloseOperation (EXIT_ON_CLOSE); 
		
		// sichtbar machen
		setVisible (true);
	}
}

class MyJPanel extends JPanel{

	static int i = 0;
	
	public void paint(Graphics g) { 

		System.out.println("paint-Methode: "+i);
		i++;
		g.drawString ("Hello, world", 50, 60);    
		g.setColor(Color.RED);
		g.fillRect(10, 300, 200, 40);
	} 

}
