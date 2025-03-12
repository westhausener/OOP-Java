import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class RechteckFrame extends JFrame{
	
	private Rechteck r;
	
   public static void main (String[] args){
   
	   // Rechteck-Objekt mit Referenzvariable "r" erzeugen
	   // Rechteck r = //.....
	   Rechteck r = new Rechteck(400, Color.YELLOW);
	   
	   new RechteckFrame(r);
   }
   
   public RechteckFrame(Rechteck r){
      
	  this.r = r;
	   
	  setTitle("Rechteck");
 
      // Größe des Fensters
      setSize (600, 300); 
      setDefaultCloseOperation (EXIT_ON_CLOSE);
      
      // sichtbar machen
      setVisible (true);
   }
   
   public void paint(Graphics g){
	  
	  g.setColor(r.getC());
	  g.fillRect(20, 50, r.getL(), r.getB());
	  
   }
}
