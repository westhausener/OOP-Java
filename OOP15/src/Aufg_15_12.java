import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Aufg_15_12 extends JFrame implements ActionListener {

	private JLabel pfad;
	private JButton btn;
	private JTextArea jta;
	
	

	// Konstruktor
	public Aufg_15_12(){
		super("Aufgabe 15.12");
		
		JPanel myPanel = new JPanel();
		myPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		pfad = new JLabel();
		btn = new JButton("Datei wählen");
		btn.addActionListener(this);
		myPanel.add(btn);
		myPanel.add(pfad);
		
		add(myPanel, BorderLayout.NORTH);
		
		// rows and columns als Parameter
		jta = new JTextArea(8,200);
		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().add( jta );
		add(scroll, BorderLayout.CENTER);
		
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible (true);
		
	}
	
	public static void main(String[] args) {
		new Aufg_15_12();

	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn)){
			JFileChooser fc = new JFileChooser();
		    //fc.setFileFilter( new FileNameExtensionFilter("Textdateien", "txt", "html", "log" ) );

		    int state = fc.showOpenDialog( this ); 

		    if ( state == JFileChooser.APPROVE_OPTION ){
		    	
		    	File file = fc.getSelectedFile();
		    	this.pfad.setText(file.getAbsolutePath().toString());
		    	
		    	BufferedReader f;
		    	String line;
		    	this.jta.setText("");
		    	
				try{
					f = new BufferedReader(new FileReader(file));
					
					while((line=f.readLine())!=null){
						jta.append(line);
						jta.append("\n");
					}
					
					f.close();
					
				}catch(IOException ex){
					System.err.println("Fehler beim Lesen der Datei!");
				}
		    	
				
		    }
		}
		
	}

}
