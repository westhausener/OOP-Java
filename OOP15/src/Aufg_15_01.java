// Swing-GUI-Komponenten befinden sich im Paket javax.swing
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;


public class Aufg_15_01 extends JFrame
{
   public static void main (String[] args){
   
	   new Aufg_15_01("Hauptfenster");
   }
   
   public Aufg_15_01(String titel){
      
	  setTitle(titel);
	  
      // Label erzeugen
      JLabel label1 = new JLabel ("Hallo Welt!");

      // Layout-Manager setzen
      setLayout (new FlowLayout());

      // Label dem Hauptfenster hinzufuegen.
     add (label1);
 
      // Größe des Fensters
      setSize (600, 300); 
      setDefaultCloseOperation (EXIT_ON_CLOSE);
      
      // sichtbar machen
      setVisible (true);
   }
}
