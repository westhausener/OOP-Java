
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class LookAndFeelDemo 
{
   private static void createGUI()
   {
      // Fenster definieren.
      final JFrame frame = new JFrame ("Look and Feel-Demo");
      // Definieren, was beim Schließen des Fensters geschehen soll.
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      // Layout des Fensters setzen.
      frame.setLayout (new FlowLayout());
      
      // Combobox erzeugen.
      final JComboBox combobox = new JComboBox();
      // Combobox mit Namen der verfügbaren Look and Feels befüllen.
      for(LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels())
         combobox.addItem (laf.getClassName());
      // Combobox zum Fenster hinzufügen.
      frame.add (combobox);
      
      // Button erzeugen.
      JButton button = new JButton ("Setzen");
      
      // Dem Button einen ActionListerer hinzuf�gen.
      button.addActionListener (new ActionListener()
      {
         public void actionPerformed (ActionEvent e)
         {
            try 
            {
               // Setze neues Look and Feel.
               UIManager.setLookAndFeel ((String) combobox.getSelectedItem());
               // Fenster neuzeichen.
               SwingUtilities.updateComponentTreeUI (frame);
            }
            catch (Exception e1)
            {
            }
         }
      });
      // Button zum Fenster hinzuf�gen.
      frame.add (button);

      // Fenstergr��e setzen.
      frame.setSize (410, 200);
      // Fenster anzeigen.
      frame.setVisible (true);
   }

   public static void main (String[] args)
   {
      // GUI im Event-Dispatch-Thread erzeugen.
      SwingUtilities.invokeLater (new Runnable()
      {
         public void run()
         {
            createGUI();
         }
      });
   }
}