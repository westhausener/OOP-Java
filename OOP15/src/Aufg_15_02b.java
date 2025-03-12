
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Aufg_15_02b extends JPanel
{
	private Image imgArray[];


	public Aufg_15_02b()
	{
		
		// alle 10 Bilder laden
		imgArray = new Image[10];
		for(int i=0; i<10; i++){

			try {
				imgArray[i] = ImageIO.read(new File("/home/oliver/workspace_FOM/OOP15/bin/digit_"+i+".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}       

	}

	public void paint(Graphics g){
		// Uhrzeit bestimmen
		GregorianCalendar now = new GregorianCalendar();                  
		SimpleDateFormat formatter = new SimpleDateFormat ("HHmm");      

		String currentTime = formatter.format(now.getTime());

		Image img1, img2, img3, img4;
		img1 = imgArray[Integer.parseInt(currentTime.substring(0, 1))]; 
		img2 = imgArray[Integer.parseInt(currentTime.substring(1, 2))];
		img3 = imgArray[Integer.parseInt(currentTime.substring(2, 3))];
		img4 = imgArray[Integer.parseInt(currentTime.substring(3))];

		// Uhrzeit mit Bildern anzeigen
		g.fillRect(0, 0, getWidth(), getHeight());

		g.drawImage (img1, 10, 10, 36, 46, this);
		g.drawImage (img2, 50, 10, 36, 46, this);

		g.setColor(Color.CYAN);
		g.fillOval(92, 20, 6, 6);
		g.fillOval(92, 40, 6, 6);

		g.drawImage (img3, 100, 10, 36, 46, this);
		g.drawImage (img4, 140, 10, 36, 46, this);

	}
}
