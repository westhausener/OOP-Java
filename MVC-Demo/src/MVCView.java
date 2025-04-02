import java.util.Observable;
import java.util.Observer;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
 
 
public class MVCView extends JFrame implements Observer {
 
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel label = new JLabel("0");
     
    /**
     * Create the frame.
     */
    public MVCView(MVCController control) {
        setTitle("Java MVC Beispiel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 152, 150);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        SpringLayout sl_contentPane = new SpringLayout();
        contentPane.setLayout(sl_contentPane);
         
        JSplitPane splitPane = new JSplitPane();
        sl_contentPane.putConstraint(SpringLayout.EAST, splitPane, 0, SpringLayout.EAST, contentPane);
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setOneTouchExpandable(true);
        sl_contentPane.putConstraint(SpringLayout.NORTH, splitPane, 0, SpringLayout.NORTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.WEST, splitPane, 0, SpringLayout.WEST, contentPane);
        contentPane.add(splitPane);
         
        JButton btnDec = new JButton("dec");
        btnDec.addActionListener(control);
        btnDec.setActionCommand(MVCStatics.ACTION_DEC);
        splitPane.setLeftComponent(btnDec);
         
        JButton btnInc = new JButton("inc");
        btnInc.addActionListener(control);
        btnInc.setActionCommand(MVCStatics.ACTION_INC);
        splitPane.setRightComponent(btnInc);
         
        JLabel lblAktZahl = new JLabel("Akt. Zahl:");
        sl_contentPane.putConstraint(SpringLayout.NORTH, lblAktZahl, 1, SpringLayout.SOUTH, splitPane);
        sl_contentPane.putConstraint(SpringLayout.WEST, lblAktZahl, 0, SpringLayout.WEST, splitPane);
        contentPane.add(lblAktZahl);
         
         
        sl_contentPane.putConstraint(SpringLayout.SOUTH, label, 0, SpringLayout.SOUTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.EAST, label, 0, SpringLayout.EAST, splitPane);
        contentPane.add(label);
    }
 
    @Override
    public void update(Observable arg0, Object arg1) {
        if(arg1 instanceof MVCDecInc){
            this.label.setText(((MVCDecInc) arg1).counterToString());
            System.out.println("Text wurde gesetzt");
        }
             
    }
}