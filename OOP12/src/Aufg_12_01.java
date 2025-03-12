import java.util.*;

public class Aufg_12_01 {

	public static void main(String[] args) {
		
		HashMap<String, Double> meineHashMap = new HashMap<String, Double>();
		
		// 3 Städte/Temperaturen hinzufügen
		meineHashMap.put("Köln", 23d);
		meineHashMap.put("Berlin", 18.7);
		meineHashMap.put("München", 20.2); 
		
		System.out.println("Temperatur in Köln: "+meineHashMap.get("Köln"));
		System.out.println("Temperatur in Berlin: "+meineHashMap.get("Berlin"));
		System.out.println("Temperatur in München: "+meineHashMap.get("München"));
		
		// ausgeben in foreach-Schleife
		for(String stadt : meineHashMap.keySet()){
			System.out.println("Ort: "+stadt);
			System.out.println("Temp.: "+meineHashMap.get(stadt));
		}
	}

}
