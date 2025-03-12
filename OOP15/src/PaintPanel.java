import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class PaintPanel extends JPanel{
	
	public static final int OVAL = 1;
	public static final int RECT = 2;
	public static final int LINE = 3;
	
	private int drawItem = 0;
	private Color c = Color.MAGENTA;
	
	public void paint(Graphics g) {
		
		g.clearRect(0, 0, getWidth(), getHeight());
		
		g.setColor(c);
		
		if(drawItem==OVAL){
			
			g.fillOval(10, 10, 50, 50);
		
		}else if(drawItem==RECT){
			
			g.fillRect(10, 10, 50, 50);
		
		}else if(drawItem==LINE){
			
			g.drawLine(10,40,100,40);
			g.drawLine(10,41,100,41);
			g.drawLine(10,42,100,42);
		}
	}
	
	public void setDrawItem(int i){
		this.drawItem = i;
	}
	
	public void setColor(Color c){
		this.c = c;
	}

}
