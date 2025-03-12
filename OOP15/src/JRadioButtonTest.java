import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonTest extends JFrame implements ActionListener{

	private JRadioButton b1, b2, b3, b4;
	private ButtonGroup group;
	private JButton btn1;
	
	public JRadioButtonTest() {
		super("JRadioButtonTest");
		
		setLayout(new GridLayout(5,1));
		
		b1 = new JRadioButton("Fußball");
		b2 = new JRadioButton("Eishockey");
		b3 = new JRadioButton("Basketball");
		b4 = new JRadioButton("Handball");
		
		b1.setSelected(true);
		
		group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		group.add(b3);
		group.add(b4);
		
	    add(b1);
	    add(b2);
	    add(b3);
	    add(b4);
	    
	    btn1 = new JButton("Los gehts!");
	    btn1.addActionListener(this);
	    add(btn1);
		
		setDefaultCloseOperation (EXIT_ON_CLOSE);
	    setSize(200,200);
	    setVisible (true);
	}

	public static void main(String[] args) {
		new JRadioButtonTest();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
			AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
            	System.out.println(button.getText());
            }
		}
		
	}
}
