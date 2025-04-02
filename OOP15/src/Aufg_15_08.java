import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Aufg_15_08 extends JFrame implements ActionListener{
		
	private JComboBox<String> combo;
	private PaintPanel panel;
	
	public Aufg_15_08(){
		
		setTitle("Aufgabe 15.08");
		setLayout(new BorderLayout());
		
		String items[] = {"Bitte wählen","Kreis zeichnen","Rechteck zeichnen","Linie zeichnen"};
		combo = new JComboBox<String>(items);
		combo.setSelectedIndex(0);
		combo.addActionListener(this);
		add(combo, BorderLayout.SOUTH);
		
		panel = new PaintPanel();
		add(panel, BorderLayout.CENTER);
						
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	    setSize(200,200);
	    setVisible (true);
	}
	

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==combo){			
			panel.setDrawItem(combo.getSelectedIndex());
			panel.repaint();
			
			System.out.println("Wert: "+combo.getSelectedItem().toString());
			System.out.println("Index: "+combo.getSelectedIndex());
			
		}
	}

	
	public static void main(String[] args) {
		
		new Aufg_15_08();

	}
}
