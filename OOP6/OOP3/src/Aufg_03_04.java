
public class Aufg_03_04{
	
   public static void main (String[] args){
      
      String ganzerPfad = "C:\\Eigene Dateien\\Javatest\\Beispiel.java";
     
     // Extension
      String ext = ganzerPfad.substring(ganzerPfad.lastIndexOf(".")+1);
      System.out.println("Ext.: "+ext);
      
      // Datei
      String datei = ganzerPfad.substring(ganzerPfad.lastIndexOf("\\")+1, ganzerPfad.lastIndexOf("."));
      System.out.println("Datei.: "+datei);
      
      // Verzeichnis
      String verz = ganzerPfad.substring(0, ganzerPfad.lastIndexOf('\\'));
      System.out.println("Verz.: "+verz);
      
   }
   
}