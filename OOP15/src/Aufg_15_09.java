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
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Aufg_15_09 extends JFrame implements ChangeListener{
		
	private JSlider slider;
	private JLabel label;
	
	public Aufg_15_09(){
		
		super("Aufgabe 15.09");
		setLayout(new BorderLayout());
		
		// Initilaisierungsvariablen für den Schieberegler.
	    int min = 0;
	    int max = 100;
	    int start = 0;
		
		slider = new JSlider(min,max,start);		
		add(slider, BorderLayout.SOUTH);
		
		// Event-Listener
	    slider.addChangeListener(this);	            	            			
	    
	    label = new JLabel("Wert: "+start);
		add(label, BorderLayout.NORTH);
						
		setDefaultCloseOperation (EXIT_ON_CLOSE);
	    setSize(200,200);
	    setVisible (true);
	}

	
	public void stateChanged(ChangeEvent arg0) {
		// Aktuelle Position des Schiebereglers abfragen.
        label.setText("Wert: "+slider.getValue());
		
	}
	
    public static void main(String[] args) {
		
		new Aufg_15_09();

	}

}
