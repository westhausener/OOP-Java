import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Aufg_15_07 extends JFrame implements ActionListener{

	private JButton b;
	private JLabel label;
	private JCheckBox c1, c2, c3;
	
	public Aufg_15_07(){
		
		setTitle("Aufgabe 15.07");
		setLayout(new BorderLayout());
		
		label = new JLabel("<html><body><i><font size=\"20\">Wählen Sie Ihren Pizzabelag:</font></i></body></html>", JLabel.CENTER);
		
		add(label, BorderLayout.NORTH);
		label.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		c1 = new JCheckBox ("Oliven", false);
		c2 = new JCheckBox ("Salami", false); 
		c3 = new JCheckBox ("Thunfisch", false); 
				
		panel.add(c1);
		panel.add(c2);
		panel.add(c3);
		
		add(panel, BorderLayout.CENTER);
		
		b = new JButton("bestellen");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
		
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	    pack();
	    setVisible (true);
	}
	

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b){
		     System.out.println("Folgende Zutaten wurden gewählt:");
		     if(c1.isSelected())
		    	 System.out.println("- Oliven");
		     if(c2.isSelected())
		    	 System.out.println("- Salami");
		     if(c3.isSelected())
		    	 System.out.println("- Thunfisch");
		}
	}

	
	public static void main(String[] args) {
		
		new Aufg_15_07();

	}
}
