import java.io.File;


public class Aufg_13_01 {

	public static void main(String[] args) {
		
			listAllFiles(new File("/home/oliver/FOM/2015_SS/OOP"));

	}
	
	private static void listAllFiles(File dir){
			
		// wenn Verzeichnis, dann alle Dateien/Verzeichnisse daraus in ein FileArray laden
		if(dir.isDirectory()){
			File[] fArray = dir.listFiles();
		
			// dieses FileArray in einer Schleife durchlaufen
			for(File myFile : fArray){
			
				// wenn Datei, dann Pfad und Dateinamen mit Minuszeichen ausgeben
				if(myFile.isFile()){
					
					System.out.println("- "+myFile.getAbsolutePath());
				
				// wenn Verzeichnis, dann Pfad und Dateiname mit Pluszeichen ausgeben und
				// Methode listAllFiles mit Verzeichnis-File aufrufen
				}else if(myFile.isDirectory()){
					System.out.println("+ "+myFile.getAbsolutePath());
					listAllFiles(myFile);
				}
			}
					
		}else{
			System.err.println("Das ist kein Verzeichnis!");
		}
	}
}



