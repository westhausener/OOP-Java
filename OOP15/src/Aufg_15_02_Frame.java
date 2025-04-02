import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;


public class Aufg_15_02_Frame extends JFrame {

	public static void main(String[] args) {
		new Aufg_15_02_Frame("Hauptfenster");

	}

	public Aufg_15_02_Frame(String titel){
		super(titel);

		// JPanel dem Hauptfenster hinzufuegen.
		Aufg_15_02 myJPanel = new Aufg_15_02();
		//Aufg_15_02b myJPanel = new Aufg_15_02b();
		//Aufg_15_02c myJPanel = new Aufg_15_02c();
		myJPanel.setSize(300,300);
		add (myJPanel, BorderLayout.CENTER);

		// Größe des Fensters
		setSize (300, 300);

		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		// sichtbar machen
		setVisible (true);
	}
}
