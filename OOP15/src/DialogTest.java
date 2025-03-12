// Datei: DialogTest.java

import javax.swing.*;

public class DialogTest
{
   public static void main (String[] args)
   {
      JDialog dialog = new JDialog();
      dialog.setTitle ("Dialog ohne Vaterfenster");
      dialog.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
      dialog.setSize (400, 100);
      dialog.setVisible (true);
   }
}
