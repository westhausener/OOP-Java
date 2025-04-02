import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutTest extends JFrame
{

   public static void main (String[] args){ new NullLayoutTest(); }
   
   public NullLayoutTest(){
     super ("Null-Layout");

      setLayout(null);
      
      JButton b1 = new JButton("Button 1");
      b1.setBounds(10, 10, 200, 100);
      add(b1);
      
      JButton b2 = new JButton("Button 2");
      b2.setLocation(250, 120);
      b2.setSize(100, 50);
      add(b2);
 
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      setSize(380,200);
      setVisible (true);
   }
}
