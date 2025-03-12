import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTest2 extends JFrame implements ActionListener{

	private JButton jButton0, jButton1;
	private int i = 0;
	
	public JButtonTest2() {
		
		jButton0 = new JButton();
		jButton0.setText("OK");
		jButton0.addActionListener(this);
		
		jButton1 = new JButton();
		jButton1.setText("Abbrechen");
		jButton1.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(jButton0);
		add(jButton1);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("JButtonTest");				
		pack();
		setVisible(true);
	}
		
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==jButton0)
			System.out.println(e.getActionCommand());			
		else if(e.getSource()==jButton1)
			System.out.println(e.getActionCommand());
		
	}
	
	
	public static void main(String[] args) {		
		
		new JButtonTest2();
			
	}	

}
