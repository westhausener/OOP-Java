import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesSchreiben {
	
	public static void main(String[] args){

		Properties prop = new Properties();
		FileOutputStream output = null;

		try {

			output = new FileOutputStream("config.properties");

			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "oliver");
			prop.setProperty("dbpassword", "geheim");

			// save properties to project root folder
			prop.store(output, "Ich bin ein spitzen Kommentar!");
			
			output.close();

		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}
