import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Aufg_15_07b extends JFrame implements ActionListener{

	private JCheckBox c1, c2, c3;
	private JButton b; 
	private JComboBox<String> combo;
	
	public Aufg_15_07b(){
		
		super("Aufgabe 15.07b");
		
		JLabel l1 = new JLabel("Bitte wählen Sie Ihren Pizzabelag:");
		add(l1, BorderLayout.NORTH);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 3));
		p1.add(c1 = new JCheckBox("Oliven"));
		p1.add(c2 = new JCheckBox("Salami"));
		p1.add(c3 = new JCheckBox("Thunfisch"));
		add(p1, BorderLayout.CENTER);
		
		String[] items = {"Bitte wählen", "klein", "groß", "Pizzablech"};
		combo = new JComboBox<String>(items);
		add(combo, BorderLayout.EAST);
		
		add(b = new JButton("bestellen"), BorderLayout.SOUTH);
		b.addActionListener(this);
		
		setDefaultCloseOperation (EXIT_ON_CLOSE);
	    pack();
	    setVisible (true);
	}
	
	public static void main(String[] args) {
		
		new Aufg_15_07b();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Gewählte Pizzabeläge:");
		if(c1.isSelected()){
			System.out.println("- Oliven");
		}
		if(c2.isSelected()){
			System.out.println("- Salami");
		}
		if(c3.isSelected()){
			System.out.println("- Thunfisch");
		}
		System.out.println("Größe: "+combo.getSelectedItem());
		
	}
}
