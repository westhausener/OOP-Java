
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Aufg_15_14 extends JFrame implements ActionListener 
{
	public Aufg_15_14(String title)
	{
		super(title);

		// Definieren, was beim Schließen des Fensters geschehen soll.
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		// Layout des Fensters setzen.
		setLayout (new FlowLayout());

		// alle verfügbaren Look and Feels in Buttons packen.
		for(LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()){
			JButton jb = new JButton(laf.getClassName());
			jb.addActionListener(this);
			add(jb);
		}
								
		// Fenstergröße setzen.
		setSize (410, 200);
		// Fenster anzeigen.
		setVisible (true);
	}

	public static void main (String[] args)
	{
		// GUI im Event-Dispatch-Thread erzeugen.
		SwingUtilities.invokeLater (new Runnable()
		{
			public void run()
			{        	 
				new Aufg_15_14("Look and Feel-Chooser");
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try 
		{
			// Setze neues Look and Feel.
			UIManager.setLookAndFeel (e.getActionCommand());
			// Fenster neuzeichen.
			SwingUtilities.updateComponentTreeUI (this);
		}
		catch (Exception e1)
		{
			JOptionPane.showMessageDialog(this, e1.getMessage(),"Fehler",JOptionPane.ERROR_MESSAGE);
		}

	}
}