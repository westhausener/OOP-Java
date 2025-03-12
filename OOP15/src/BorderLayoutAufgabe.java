import java.awt.BorderLayout;

import javax.swing.*;


public class BorderLayoutAufgabe extends JFrame {

	public static void main(String[] args) {
		new BorderLayoutAufgabe();
	}
	
	public BorderLayoutAufgabe(){
		
		super("BorderLayout GUI");
		
		add(new JButton("Button North"), BorderLayout.NORTH);
		add(new JButton("Button South"), BorderLayout.SOUTH);
		add(new JButton("Button West"), BorderLayout.WEST);
		add(new JButton("Button East"), BorderLayout.EAST);
		
		// JPanel in den Center-Bereich packen
		/*JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(new JTextField("Text1"), BorderLayout.NORTH);
		p.add(new JTextField("Text2"), BorderLayout.SOUTH);
		p.add(new JTextField("Text3"), BorderLayout.WEST);
		p.add(new JTextField("Text4"), BorderLayout.EAST);
		p.add(new JTextField("Text5"), BorderLayout.CENTER);*/
		add(new Aufg_15_02(), BorderLayout.CENTER); 
		
		//add(p, BorderLayout.CENTER);
		
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		pack();
		setVisible (true);

	}

}
