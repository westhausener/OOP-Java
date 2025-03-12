import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CheckBoxFrameSizeColor extends JFrame implements ActionListener{
		
	private JComboBox<String> combo;
	
	private JButton b;
	private JPanel p;
	
	
	public CheckBoxFrameSizeColor(){
		
		setTitle("CheckBoxFrameSize");
		setLayout(new BorderLayout());
		
		String items[] = {"Bitte wählen","640 x 480","800 x 600","maximal"};
		combo = new JComboBox<String>(items);
		combo.setSelectedIndex(0);
		combo.addActionListener(this);
		add(combo, BorderLayout.NORTH);
		
		b = new JButton("Farbe ändern");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
		
		p = new JPanel();
		add(p, BorderLayout.CENTER);
		
		setDefaultCloseOperation (EXIT_ON_CLOSE);
	    setSize(200,200);
	    setVisible (true);
	}
	

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==combo){
			
			if(combo.getSelectedIndex()==1){
				this.setSize(640, 480);
				this.setExtendedState(NORMAL);
			
			}else if(combo.getSelectedIndex()==2){
				this.setSize(800, 600);
				this.setExtendedState(NORMAL);
				
			}else if(combo.getSelectedIndex()==3)
				this.setExtendedState(MAXIMIZED_BOTH);
			
			System.out.println("Wert: "+combo.getSelectedItem().toString());
			System.out.println("Index: "+combo.getSelectedIndex());
			
		}else if(e.getSource()==b){
			Color c = JColorChooser.showDialog(this, "Farbe wählen", Color.WHITE);
			p.setBackground(c);
		}
	}

	
	public static void main(String[] args) {
		
		new CheckBoxFrameSizeColor();

	}
}
