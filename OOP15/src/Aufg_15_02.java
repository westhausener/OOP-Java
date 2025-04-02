// Datei: InternalFrameTest.java

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class Aufg_15_02 extends JPanel
{
	public void paint(Graphics g)
	   {
	      Font f = new Font("Lucida Sans Bold", Font.PLAIN, 22);
	      g.setFont(f);
	      g.drawString ("FOM FOM", 5, 20);
		  
		  g.setColor(Color.BLUE);
		  g.drawOval(10, 30, 50, 50);
		  
		  g.setColor(Color.GREEN);
		  g.fillRect(20, 90, 100, 40);
		  
		  g.setColor(Color.MAGENTA);
		  g.drawLine(140, 10, 140, 200);
		  
		  System.out.println("Fertisch mit paint(Graphics g)");
		  
	   }
  
}
