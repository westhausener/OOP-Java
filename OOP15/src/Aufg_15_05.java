import java.awt.BorderLayout;

import javax.swing.*;


public class Aufg_15_05 extends JFrame {

	public static void main(String[] args) {
		new Aufg_15_05();
	}
	
	public Aufg_15_05(){
		
		super("BorderLayout GUI");
		
		add(new JButton("Norden"), BorderLayout.NORTH);
		add(new JButton("Süden"), BorderLayout.SOUTH);
		add(new JButton("Westen"), BorderLayout.WEST);
		add(new JButton("Osten"), BorderLayout.EAST);
		add(new Aufg_15_02(), BorderLayout.CENTER);
		
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible (true);

	}

}
