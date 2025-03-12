import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton jButton0;
	private int i = 0;
	
	public JButtonTest() {
		
		jButton0 = new JButton();
		jButton0.setText("Klick mich ["+i+"]");
		jButton0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				i++;
				jButton0.setText("Klick mich ["+i+"]");
				System.out.println("Event-Quelle: "+event.getSource().toString());
				System.out.println("Event-Kommando: "+event.getActionCommand());
			}
		});
		
		setLayout(new FlowLayout());
		add(jButton0);
		setSize(254, 66);
	}
		
	
	public static void main(String[] args) {		
		
		JButtonTest frame = new JButtonTest();
		frame.setDefaultCloseOperation(JButtonTest.EXIT_ON_CLOSE);
		frame.setTitle("JButtonTest");				
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

}
