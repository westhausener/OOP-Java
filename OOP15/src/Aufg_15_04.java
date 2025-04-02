import javax.swing.*;
import java.awt.*;

public class Aufg_15_04
{
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Aufgabe 15.04 - GridBagLayout");
      // Layout-Manager setzen.
      frame.setLayout (new GridBagLayout());

      GridBagConstraints c;
      // Objekt fuer Abstaende zwischen den GUI-Komponenten.
      Insets set = new Insets (1, 1, 1, 1);
            
      c = new GridBagConstraints();
      c.insets = set; // Abstaende setzen.
      c.gridx = 0;    // Position auf X-Achse setzen.
      c.gridy = 0;    // Position auf Y-Achse setzen.      
      c.anchor = GridBagConstraints.LINE_START;
      c.fill = GridBagConstraints.BOTH;
      // die horizontale Ausdehnung erlauben
      c.weightx = 1.0;
      // die vertikale Ausdehnung verbieten
      c.weighty = 0.0;
      frame.add (new JButton ("Button 1"), c);
      
      c.gridx=1;
      frame.add (new JButton ("Button 2"), c);     
      c.gridx=2;
      frame.add (new JButton ("Button 3"), c);
      c.gridx=3;
      frame.add (new JButton ("Button 4"), c);
      
      // 2. Zeile
      c.gridy=1;
      c.gridx=0;
      // die vertikale Ausdehnung erlauben
      c.weighty = 1.0;
      c.gridwidth = GridBagConstraints.REMAINDER;
      frame.add (new JButton ("Button 5"), c);
      
      // 3. Zeile
      c.gridx=0;
      c.gridy=2;
      c.gridwidth = 3;
      frame.add (new JButton ("Button 6"), c);
      
      c.gridwidth = 1;
      c.gridx=3;
      frame.add (new JButton ("Button 7"), c);
      
      // 4. Zeile
      c.gridx=0;
      c.gridy=3;
      c.gridwidth=1;
      c.gridheight=2;            
      frame.add (new JButton ("Button 8"), c);     
      
      c.gridx=1;
      c.gridwidth = GridBagConstraints.REMAINDER;
      c.gridheight=1;
      frame.add (new JButton ("Button 9"), c);
      
      // 5. Zeile
      c.gridx=1;
      c.gridy=4;
      frame.add (new JButton ("Button 10"), c);
      

      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible (true);
   }
}
