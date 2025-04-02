
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Aufg_15_02c extends JPanel
{
	private Image imgArray[];
	private String currentTime;
	private TimeThread tt;


	public Aufg_15_02c()
	{
		String pfad= System.getProperty("java.class.path");
		System.out.println("Pfad: "+pfad);
		
		// alle 10 Bilder laden
		imgArray = new Image[10];
		for(int i=0; i<10; i++){

			try {
				imgArray[i] = ImageIO.read(new File(pfad+File.separator+"digit_"+i+".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}  
		
		 tt = new TimeThread(this);
	     tt.start();

	}

	public void paint(Graphics g){
		// Uhrzeit bestimmen
		GregorianCalendar now = new GregorianCalendar();                  
		SimpleDateFormat formatter = new SimpleDateFormat ("HHmm");      

		currentTime = formatter.format(now.getTime());

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
	
	public void setCurrentTime(String currentTime) {
		   this.currentTime = currentTime;
    } 
}

class TimeThread extends Thread{
	Aufg_15_02c a;
	private boolean active = true;
	
	public TimeThread(Aufg_15_02c a){
		this.a = a;
	}
	
	public void run(){
		
		while(active){
			System.out.println("Aktualisiere Zeit");
			
			GregorianCalendar now = new GregorianCalendar();                  
			SimpleDateFormat formatter = new SimpleDateFormat ("HHmm");      
			a.setCurrentTime(formatter.format(now.getTime()));
			a.repaint();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Thread beendet");
	}
	
	public void setActive(boolean b){
		this.active = b;
	}
}
