import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFileChooserDemo
{
  public static void main( String[] args )
  {
    JFileChooser fc = new JFileChooser();
    //fc.setFileFilter( new FileNameExtensionFilter("Textdateien", "txt", "html", "log" ) );

    int state = fc.showOpenDialog( null ); 
    //int state = fc.showSaveDialog( null );

    if ( state == JFileChooser.APPROVE_OPTION )
    {
      File file = fc.getSelectedFile();
      System.out.println( file.getName() );
    }
    else
      System.out.println( "Auswahl abgebrochen" );

    System.exit( 0 );
  }
}