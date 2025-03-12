import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Aufg_15_06 extends JFrame implements ActionListener{

	private JButton b1, b2, b3;
	private JLabel label;
	
	public Aufg_15_06(){
		
		super("Aufgabe 15.06");
		
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		JPanel jp = new JPanel();
		jp.add(b1);
		jp.add(b2);
		jp.add(b3);
		
		add(jp, BorderLayout.NORTH);
		
		label = new JLabel("Noch nicht gedrückt!");
		add(label, BorderLayout.CENTER);
		
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	    //setSize(400,200);
	    pack();
		setVisible (true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
			label.setText("Schaltfläche 1 wurde gedrückt!");
		else if(e.getSource()==b2)
			label.setText("Schaltfläche 2 wurde gedrückt!");
		else if(e.getSource()==b3)
			label.setText("Schaltfläche 3 wurde gedrückt!");
			
	}
	
	
	public static void main(String[] args) {
		
		new Aufg_15_06();
	}
}
