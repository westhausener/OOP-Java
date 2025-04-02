import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Aufg_15_13 extends JFrame implements ActionListener {

	private JButton btn;
	private JComboBox combo;
	private PaintPanel panel;
	
	// Konstruktor
	public Aufg_15_13(){
		
		super("Aufgabe 15.13");
		String items[] = {"Bitte wählen","Kreis zeichnen","Rechteck zeichnen","Linie zeichnen"};
		combo = new JComboBox<String>(items);
		combo.setSelectedIndex(0);
		combo.addActionListener(this);
		add(combo, BorderLayout.SOUTH);
		
		panel = new PaintPanel();
		add(panel, BorderLayout.CENTER);
		
		btn = new JButton("Farbe wählen");
		btn.addActionListener(this);
		add(btn, BorderLayout.NORTH);
		
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	    setSize(200,200);
	    setVisible (true);
		
	}
	
	public static void main(String[] args) {
		new Aufg_15_13();

	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn)){
			Color newColor = JColorChooser.showDialog( this, 	
					  "Wähle neue Farbe",						
					  Color.BLACK );
			
			panel.setColor(newColor);
			panel.repaint();
			
		}else if(e.getSource().equals(combo)){
			
			panel.setDrawItem(combo.getSelectedIndex());
			panel.repaint();
		}
		
	}

}
