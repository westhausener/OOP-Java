import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Aufg_15_03 extends JFrame
{
   public static void main (String[] args){
	   new Aufg_15_03();
   }
   
   public Aufg_15_03()
   {
     super("Hauptfenster");      

      // Layout-Manager setzen
      setLayout(new FlowLayout());

      // 1. JPanel mit GridLayout (4 Zeilen 3 Spalten) -> JButtons
      JPanel jp1 = new JPanel();
      jp1.setLayout(new GridLayout(4,3));
      for(int i=1; i<=12; i++){
    	  jp1.add(new JButton("Button "+i));
      }
      add(jp1);
      
      // 2. JPanel mit GridLayout (1 Zeile 2 Spalten)) -> JLabel und JButton
      JPanel jp2 = new JPanel();
      jp2.setLayout(new GridLayout(1,2));
      jp2.add(new JLabel("FOM"));
      jp2.add(new JButton("Drück mich!"));
      add(jp2);
      
      // Größe des Fensters
      pack();
      
      setDefaultCloseOperation (EXIT_ON_CLOSE);
      
      // sichtbar machen
      setVisible (true);
   }
}
