import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Aufg_15_13a extends JFrame implements ActionListener {

	private JButton btn;

	// Konstruktor
	public Aufg_15_13a(){

		super("Aufgabe 15.13a");

		btn = new JButton("Farbe wählen");
		btn.addActionListener(this);
		add(btn, BorderLayout.CENTER);

		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setSize(200,200);
		setVisible (true);

	}

	public void actionPerformed(ActionEvent e) {

		Color newColor = JColorChooser.showDialog(this, "Wähle neue Farbe", Color.BLACK);
		btn.setBackground(newColor);
		// für die Macs
		//btn.setOpaque(true);
		//btn.setBorderPainted(false);
	}


	public static void main(String[] args) {
		new Aufg_15_13a();

	}
}
