
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class BildFrame extends JFrame{

	public static void main(String[] args) {
		new BildFrame();

	}
	
public BildFrame(){
	
	super("Bild");

	BildPanel myPanel = new BildPanel();
	myPanel.setSize(300,300);
	add (myPanel, BorderLayout.CENTER);

	// Größe des Fensters
	setSize (300, 300);

	setDefaultCloseOperation (EXIT_ON_CLOSE);

	// sichtbar machen
	setVisible (true);
}

}


class BildPanel extends JPanel{

   private Image i;

   public BildPanel(){

     try{ 
       i = ImageIO.read(new File("/home/oliver/Bilder/Desktop/Korn_Black.jpg"));
    	//i  = ImageIO.read(BildPanel.class.getResource( "Korn_Black.jpg" ));
    	//System.out.println("Pfad: "+BildPanel.class.getResource( "Korn_Black.jpg" ));
    	
     } catch (IOException e) {
       e.printStackTrace();
     }
   }

   public void paint (Graphics g){
	   System.out.println("Bin in paint!");
      g.drawImage (i, 0, 0, getWidth(), getHeight(), this);
      
   }
}