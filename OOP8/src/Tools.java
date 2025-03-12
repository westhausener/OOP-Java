import java.io.*;

public class Tools{

  public static int intEingabe(){
    String eingebs = "";
    InputStreamReader daten = new InputStreamReader(System.in);
    BufferedReader eingeb = new BufferedReader(daten);
    try{
      System.out.println("Ihre Eingabe (int): ");
      eingebs = eingeb.readLine();

    }catch (Exception e){
    	System.out.println(" Falsche Eingabe ");
    }

    int eingebi;
    try {
    	eingebi = Integer.valueOf(eingebs).intValue();
    }catch (Exception e){
    	System.out.println("!! Leider keine Zahl eingeben, Wert = 0 !!");
    	eingebi = 0;
    }
    
    return eingebi;
  }
  
  
  public static String stringEingabe(){
    String eingebs = "";
    InputStreamReader daten = new InputStreamReader(System.in);
    BufferedReader eingeb = new BufferedReader(daten);
    try{
      System.out.println("Ihre Eingabe (String): ");
      eingebs = eingeb.readLine();

    }catch (Exception e){
    	System.out.println(" Falsche Eingabe ");
    }

    return eingebs;
  }
  
  
  public static double doubleEingabe(){
	  String eingebs = "";
	  InputStreamReader daten = new InputStreamReader(System.in);
	  BufferedReader eingeb = new BufferedReader(daten);
	  try{
		  System.out.println("Ihre Eingabe (double): ");
		  eingebs = eingeb.readLine();

	  }catch (Exception e){
		  System.out.println(" Falsche Eingabe ");
	  }
	  
	  double eingebi=0;   
	  try {
		  eingebi = Double.parseDouble(eingebs);
	  }catch (Exception e){
		  System.out.println("Bitte eine Flieﬂkommazahl eingeben (mit Punkt - kein Komma)");
	  }
	  return eingebi;
  }
  

	public static boolean booleanEingabe(){

		System.out.print("Bitte 1=true oder 0=false eingeben: ");
		int eingabe = intEingabe();
		if(eingabe == 1){
			return true;
		}else {
			return false;
		}
	}


}
