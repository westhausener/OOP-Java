import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class Aufg_15_05b extends JFrame
{

   public static void main (String[] args){
	   new Aufg_15_05b();
   }
   
   public Aufg_15_05b()
   {
      super ("Aufgabe 15.05b - Null-Layout");

      setLayout(null);
      
      JPanel p1 = new JPanel();
      p1.setLayout(new BorderLayout());
      
      p1.add(new JButton("Button 1"), BorderLayout.NORTH);
      p1.add(new JButton("Button 2"), BorderLayout.SOUTH);
      p1.add(new JButton("Button 3"), BorderLayout.WEST);
      p1.add(new JButton("Button 4"), BorderLayout.EAST);
      p1.add(new JLabel("Ich bin im CENTER!"), BorderLayout.CENTER);
      p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      p1.setBounds(0,0,300,150);                        
      add(p1);
      
      JPanel p2 = new JPanel();
      p2.setLayout(new BorderLayout());
      p2.add(new JLabel("Label 1"), BorderLayout.NORTH);
      p2.add(new JButton("Button 5"), BorderLayout.SOUTH);
      p2.setBorder(BorderFactory.createTitledBorder("Titel 1"));
      p2.setBounds(320, 50, 100, 70);     
      add(p2);
      
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      setSize(600,200);
      setVisible (true);
   }
}
