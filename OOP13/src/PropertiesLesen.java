import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLesen {
	public static void main(String[] args){

		Properties prop = new Properties();
		FileInputStream input = null;

		try {

			input = new FileInputStream("config.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("dbuser"));
			System.out.println(prop.getProperty("dbpassword"));

			input.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} 
	}
}
