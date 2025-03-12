import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Aufg_13_02 {

	public static void main(String[] args){

		Properties prop = new Properties();
		FileInputStream input;

		try {

			input = new FileInputStream("/home/oliver/eclipse/java-neon/eclipse/configuration/config.ini");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println("- eclipse.application: "+prop.getProperty("eclipse.application"));
			System.out.println("- eclipse.product: "+prop.getProperty("eclipse.product"));
			System.out.println("- eclipse.buildId: "+prop.getProperty("eclipse.buildId"));

			input.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} 
	}
}
