import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Aufg_15_12a extends JFrame implements ActionListener {

	private JTextField tf;
	private JButton btn;
	
	// Konstruktor
	public Aufg_15_12a(){
		super("MeineGUI - Aufgabe 15.12a");
		
		// Textfeld für den Dateipfad in den NORTH-Bereich
		tf = new JTextField();
		add(tf, BorderLayout.NORTH);
		
		// JButton in zum Starten des JFile>Choosers im CENTER-Bereich
		btn = new JButton("Datei wählen");
		btn.addActionListener(this);
		add(btn, BorderLayout.CENTER);
		
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setSize(400,100);
		setVisible (true);
		
	}
		
	public void actionPerformed(ActionEvent e) {
		// JFileChooser öffnen und Datei zum Öffnen auswählen
		JFileChooser fc = new JFileChooser();
		//fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int state = fc.showOpenDialog(null);
		if(state == JFileChooser.APPROVE_OPTION){
			File f = fc.getSelectedFile();
			tf.setText(f.getAbsolutePath());
		}
	}
	
	public static void main(String[] args) {
		new Aufg_15_12a();

	}
}
