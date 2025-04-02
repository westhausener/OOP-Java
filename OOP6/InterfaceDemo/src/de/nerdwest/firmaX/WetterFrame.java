package de.nerdwest.firmaX;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import de.nerdwest.firmaY.*;

public class WetterFrame extends JFrame implements ActionListener{

	private JButton temperaturButton, luftdruckButton;
	private JLabel temperaturLabel, luftdruckLabel;
	private Wetterstation ws;
	
	public WetterFrame(){
		
		super("Wetterstation 1.0");
		
		ws = new WetterstationDummy();
		
		setLayout(new GridLayout(2,2));
		temperaturButton = new JButton("Hole Temperatur");
		temperaturButton.addActionListener(this);
		luftdruckButton = new JButton("Hole Luftdruck");
		luftdruckButton.addActionListener(this);
		
		temperaturLabel = new JLabel();
		luftdruckLabel = new JLabel();
		
		add(temperaturButton);
		add(temperaturLabel);
		add(luftdruckButton);
		add(luftdruckLabel);
		
		setSize(400,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==temperaturButton){
			
			temperaturLabel.setText("Temperatur: "+ws.getGradCelsius()+" Grad Celsius");
			
		}else if(e.getSource() == luftdruckButton){
			
			luftdruckLabel.setText("Luftdruck: "+ws.getLuftdruck()+" hPa");
		}
		
	}
	
}
